package javaCampDay5Homework.business.concretes;

import javaCampDay5Homework.business.abstracts.UserService;
import javaCampDay5Homework.core.EmailCheckService;
import javaCampDay5Homework.core.LoginService;
import javaCampDay5Homework.dataAccess.abstracts.UserDao;
import javaCampDay5Homework.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailCheckService emailCheckService;
	private LoginService googleService;
	
	public UserManager(UserDao userDao,EmailCheckService emailCheckService,LoginService googleService) {
		this.userDao = userDao;
		this.emailCheckService = emailCheckService;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		if(user.getFirstName().length() <=2 && user.getLastName().length() <=2) {
			System.out.println("Ad ve Soyad en az 2 karakterden olusmalidir");
		}
		
		if(user.getPassword().length() <6) {
			System.out.println("Sifre 6 haneden fazla olmali");
		}
		
		if(!emailCheckService.emailRegexControl(user)) {
			System.out.println("Gecersiz e-mail adresi");
			return;
		}
		
		for(User customUser : userDao.getAll()) {
			if(customUser.getEmail() == user.getEmail()) {
				System.out.println("Bu e-mail adresi zaten kayitli");
			}
		}
		
		userDao.add(user);
		System.out.println("Email adresi onaylandi ve kullanici kayit olundu");
		
	}

	@Override
	public void login(String email, String password) {
		for(User person : userDao.getAll()) {
			if(person.getEmail() == email && person.getPassword() == password) {
				System.out.println("Giris basarili : " + person.getFirstName() + " " + person.getFirstName());
			}
		}
		
	}

	@Override
	public void verifyEmail(User user) {
		for(User customUser : userDao.getAll()) {
			if(customUser.getEmail() == user.getEmail()) {
				System.out.println("Bu e-mail adresi zaten kayitli");
			}
		}
	}

	@Override
	public void googleLogin(User user) {
		googleService.googleLogin(user);
		
	}

}
