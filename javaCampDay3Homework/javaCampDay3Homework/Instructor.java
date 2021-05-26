package javaCampDay3Homework;

public class Instructor extends User{
	
	private String courseNameGiven;
	
	public Instructor(int id, String email, String password, String firstName, String lastName,String courseNameGiven) {
		super(id, email, password, firstName, lastName);
		this.courseNameGiven = courseNameGiven;
	}

	public String getCourseName() {
		return courseNameGiven;
	}

	public void setCourseName(String courseNameGiven) {
		this.courseNameGiven = courseNameGiven;
	}
}
