package UniversitySystem.src.Models.Person;

public class Student extends User {
	int yearOfSemester;


	public Student(String username, String password) {
		super(username, password);
		this.yearOfSemester = 0;
	}



}
