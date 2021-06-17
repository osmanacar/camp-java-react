package javaCampDay5Homework.core;

import javaCampDay5Homework.entities.concretes.User;
import javaCampDay5Homework.jGoogle.JGoogleManager;

public class GoogleAdapter implements LoginService{

	@Override
	public void googleLogin(User user) {
		JGoogleManager jGoogleManager = new JGoogleManager();
		jGoogleManager.signInWithGoogle(user);
		
	}


}
