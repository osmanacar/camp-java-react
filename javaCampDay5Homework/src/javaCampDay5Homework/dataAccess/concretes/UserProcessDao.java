package javaCampDay5Homework.dataAccess.concretes;

import java.util.List;

import javaCampDay5Homework.dataAccess.abstracts.UserDao;
import javaCampDay5Homework.entities.concretes.ListUser;
import javaCampDay5Homework.entities.concretes.User;

public class UserProcessDao implements UserDao{
	
	private ListUser listUser;
	
	public UserProcessDao(ListUser listUser) {
		this.listUser = listUser;
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kayit eklendi");
		listUser.listUser.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kayit silindi");
		listUser.listUser.remove(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return listUser.listUser;
	}

}
