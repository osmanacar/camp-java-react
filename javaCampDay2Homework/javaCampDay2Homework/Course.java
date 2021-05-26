package javaCampDay2Homework;

public class Course {
	int id;
	String courseName;
	String courseTeacherName;
	
	public Course() {
		System.out.println("YAZILIM KURSLARI");
	}
	
	public Course(int id,String courseName,String courseTeacherName) {
		this();
		this.id = id;
		this.courseName = courseName;
		this.courseTeacherName = courseTeacherName;
	}
}
