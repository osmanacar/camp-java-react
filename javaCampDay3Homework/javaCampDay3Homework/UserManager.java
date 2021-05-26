package javaCampDay3Homework;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kisi " + user.getEmail() + " mail adresiyle kodlama.io sitesine kayit oldu.");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail() + " siteye giris yapti.");
	}
	
	public void logout(User user) {
		System.out.println(user.getEmail() + " siteden cikis yapti.");
	}
}
