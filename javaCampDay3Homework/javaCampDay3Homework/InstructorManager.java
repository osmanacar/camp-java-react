package javaCampDay3Homework;

public class InstructorManager extends UserManager{

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
	
	public void giveCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getCourseName() + " adli kursu veriyor.");
	}
	
	public void addCourse(Instructor instructor,String courseName) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + courseName + " adli kursu sisteme ekledi");
	}
}
