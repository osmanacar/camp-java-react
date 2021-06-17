package javaCampDay5Homework;

import javaCampDay5Homework.business.abstracts.UserService;
import javaCampDay5Homework.business.concretes.UserManager;
import javaCampDay5Homework.core.EmailCheckManager;
import javaCampDay5Homework.core.GoogleAdapter;
import javaCampDay5Homework.dataAccess.concretes.UserProcessDao;
import javaCampDay5Homework.entities.concretes.ListUser;
import javaCampDay5Homework.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		
		ListUser listUser = new ListUser();
		
		UserService userService = new UserManager(new UserProcessDao(listUser),new EmailCheckManager(),new GoogleAdapter()); 
		
		User user = new User(1,"Osman","Acar","osmanacar1903@gmail.com","deneme123");
		//User user2 = new User(2,"Ad","So","osmanacar1903gmail.com","123");
		
		listUser.listUser.add(user);
		
		//userService.register(user);
		//userService.register(user2);
		
		userService.googleLogin(user);
		userService.verifyEmail(user);

	}

}
