package javaCampDay3Homework;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		super.add(user);
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		super.login(user);
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		super.logout(user);
	}
	
	public void joinCourse(Student student) {
		System.out.println(student.getEmail() + " " + student.getCourseNameTaken() + " adli kursa kayit oldu.");
	}
	
	public void showCompletePercent(Student student) {
		System.out.println(student.getEmail() + " isimli kullanici " + student.getCourseNameTaken() + " kursunu yuzde " + student.getCompletingPercent() + " tamamladi.");
	}
}
