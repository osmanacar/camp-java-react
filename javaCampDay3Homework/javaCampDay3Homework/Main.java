package javaCampDay3Homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"deneme123@gmail.com","123456","Osman","Acar",33,"Java + React Kamp");
		
		StudentManager studentManager1 = new StudentManager();
		
		studentManager1.add(student1);
		studentManager1.login(student1);
		studentManager1.logout(student1);
		studentManager1.joinCourse(student1);
		studentManager1.showCompletePercent(student1);
		
		System.out.println("------------------------------");
		
		Instructor instructor1 = new Instructor(1, "instructor@gmail.com", "852963", "Egitmen", "Kisi", "Java+React Kamp");
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.add(instructor1);
		instructorManager1.login(instructor1);
		instructorManager1.logout(instructor1);
		instructorManager1.giveCourse(instructor1);
		instructorManager1.addCourse(instructor1, "Programlamaya Giris icin Temel Kurs");
	}
}
