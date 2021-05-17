package Day2Hw1;

public class Main {

	public static void main(String[] args) {
	
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","2 ay s�recek Java-React Kamp�","Engin Demirog");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","2 ay s�recek C# - Angular Kamp�","Engin Demirog");
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","Giri� seviye kurs","Engin Demirog");

		Course[] courses = {course1,course2,course3};
		

        Instructor instructor1 = new Instructor(1, "Engin","Demiro�", "MCT,PMP,ITIL");
        
        Instructor[] instructors = {instructor1};
        
        
        CourseManager courseManager = new CourseManager();
        
        courseManager.addCourse(course3);
        courseManager.addCourse(course2);
        courseManager.deleteCourse(course3);

	}

}