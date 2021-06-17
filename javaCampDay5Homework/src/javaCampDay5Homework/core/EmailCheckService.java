package javaCampDay5Homework.core;

import javaCampDay5Homework.entities.concretes.User;

public interface EmailCheckService {
	boolean emailRegexControl(User user);
	
}
