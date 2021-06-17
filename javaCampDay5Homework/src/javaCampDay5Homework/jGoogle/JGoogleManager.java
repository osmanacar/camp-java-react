package javaCampDay5Homework.jGoogle;

import javaCampDay5Homework.entities.concretes.User;

public class JGoogleManager {
	public void signInWithGoogle(User user) {
		System.out.println(user.getEmail() +" Google ile oturum acti");
	}
}
