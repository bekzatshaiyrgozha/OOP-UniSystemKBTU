package UniversitySystem.src.Models.Person;

import UniversitySystem.src.attributes.Course;
import UniversitySystem.src.attributes.Lesson;
import UniversitySystem.src.attributes.Mark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Manager extends Employee {

	HashMap<Student,List<Course>> regestrayion = new HashMap<>();



	public Manager(String username, String password) {
		super(username, password);
	}
	public void addCourse(Student student,Course course) {
		regestrayion.put(student, new ArrayList<>());
		regestrayion.get(student).add(course);
	}
	public List<Course> getCourses(Student student) {
		return regestrayion.getOrDefault(student, new ArrayList<>());

	}
	public void printAllRegistrations(){
		for(List<Course> courses : regestrayion.values()){
			for(Course course : courses){
				System.out.println(course);

			}
		}

	}

}
