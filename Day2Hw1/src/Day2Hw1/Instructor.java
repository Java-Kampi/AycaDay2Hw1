package Day2Hw1;

public class Instructor {
	
	public Instructor() {
		System.out.println("Bu class Intructor nesnesinin classýdýr!");
	}
	
	public Instructor(int id, String firstName, String lastName, String instructorDetail) {
		this.id = id;
		this.firstName = firstName ;
		this.lastName = lastName ;
		this.instructorDetail = instructorDetail;
	}

	int id;
	String firstName;
	String lastName;
	String instructorDetail;
	

}
