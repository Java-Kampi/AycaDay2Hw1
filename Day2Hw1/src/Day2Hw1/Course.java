package Day2Hw1;

public class Course {

	public Course() {
		System.out.println("Bu class Course nesnesinin classýdýr!");

	}
	public Course(int id, String courseName,String courseDetail, String instructorName) {
		this.id = id;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.instructorName = instructorName;
		
	}
	
	int id;
	String courseName;
	String courseDetail;
	String instructorName;

	
	
}
