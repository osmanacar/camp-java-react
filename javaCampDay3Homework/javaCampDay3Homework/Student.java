package javaCampDay3Homework;

public class Student extends User{
	
	private int completingPercent;
	private String courseNameTaken;
	
	public Student(int id, String email, String password, String firstName, String lastName,int completingPercent,String courseNameTaken) {
		super(id, email, password, firstName, lastName);
		this.completingPercent = completingPercent;
		this.courseNameTaken = courseNameTaken;
	}

	public int getCompletingPercent() {
		return completingPercent;
	}

	public void setCompletingPercent(int completingPercent) {
		this.completingPercent = completingPercent;
	}

	public String getCourseNameTaken() {
		return courseNameTaken;
	}

	public void setCourseNameTaken(String courseNameTaken) {
		this.courseNameTaken = courseNameTaken;
	}
}
