package javaCampDay2Homework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)","XYZ Teacher");
		Course course2 = new Course(2,"Yazilim Gelistirici Yetistirme Kampi(JAVA + REACT)","XYZ Teacher");
		Course course3 = new Course(3,"Programlamaya Giris icin Temel Kurs","XYZ Teacher");
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.courseName + " " + course.courseTeacherName);
		}
		
		System.out.println("Kurs Sayisi : " + courses.length);
		
		System.out.println("------------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.startCourse(course3);
		
		System.out.println("------------------");
		
		Profile profile1 = new Profile(1,"Osman Acar");
		courseManager.signUpPage(profile1);
		
	}

}
