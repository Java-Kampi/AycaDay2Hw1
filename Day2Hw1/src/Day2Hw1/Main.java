package Day2Hw1;

public class Main {

	public static void main(String[] args) {
	
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","2 ay sürecek Java-React Kampý","Engin Demirog");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","2 ay sürecek C# - Angular Kampý","Engin Demirog");
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","Giriþ seviye kurs","Engin Demirog");

		Course[] courses = {course1,course2,course3};
		

        Instructor instructor1 = new Instructor(1, "Engin","Demiroð", "MCT,PMP,ITIL");
        
        Instructor[] instructors = {instructor1};
        
        
        CourseManager courseManager = new CourseManager();
        
        courseManager.addCourse(course3);
        courseManager.addCourse(course2);
        courseManager.deleteCourse(course3);

	}

}