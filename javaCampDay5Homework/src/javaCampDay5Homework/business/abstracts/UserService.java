package javaCampDay5Homework.business.abstracts;

import javaCampDay5Homework.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
	void verifyEmail(User user);
	void googleLogin(User user);
}
