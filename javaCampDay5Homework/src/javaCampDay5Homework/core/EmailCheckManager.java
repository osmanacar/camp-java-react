package javaCampDay5Homework.core;

import java.util.regex.*;

import javaCampDay5Homework.entities.concretes.User;

public class EmailCheckManager implements EmailCheckService{
	
	String emailRegex = "^[\\w!#$%&'+/=?`{|}~^-]+(?:\\.[\\w!#$%&'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	@Override
	public boolean emailRegexControl(User user) {
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		return matcher.matches();
	}
}
