package UniversitySystem.src.DLL;

import java.io.File;
import java.util.Vector;

import UniversitySystem.src.Models.Person.Manager;
import UniversitySystem.src.Models.Person.Student;
import UniversitySystem.src.Models.Person.Teacher;

public class DBContext {

	static String fullPath = "//Users/bekzatshaiyrgozha/UniSystemKBTU/UniversitySystem/src/Data//" ;

	private static DBContext db = new DBContext();

	public static Vector<Teacher> teacher;
	public static Vector<Student> student;
	public static Vector<Manager> manager;

	{
		this.teacher = getTeacher();
		this.student = getStudent();
		this.manager = getManager();
	}

	private DBContext() {}


	public static Vector<Teacher> getTeacher() {
		String filePath = fullPath + "teachers.txt";
		File file = new File(filePath);
		if(!file.exists() || file.length() == 0) {
			System.out.println("File not found");
			return new Vector<>();
		}
		Object o = ReaderWriter.deserialize(filePath);

		if(o instanceof Vector) {
			return (Vector<Teacher>) o;
		}
		return new Vector<>();

	}

	public static Vector<Student> getStudent() {
		String filePath = fullPath + "students.txt";
		File file = new File(filePath);
		if(!file.exists() || file.length() == 0) {
			System.out.println("File not found");
			return new Vector<>();
		}
		Object o = ReaderWriter.deserialize(filePath);

		if(o instanceof Vector) {
			return (Vector<Student>) o;
		}
		return new Vector<>();

	}

	public static Vector<Manager> getManager() {
		String filePath = fullPath + "managers.txt";
		File file = new File(filePath);
		if(!file.exists() || file.length() == 0) {
			System.out.println("File not found");
			return new Vector<>();
		}
		Object o = ReaderWriter.deserialize(filePath);

		if(o instanceof Vector) {
			return (Vector<Manager>) o;
		}
		return new Vector<>();

	}

	public static boolean saveTeacher() {
		return ReaderWriter.serialize(teacher,fullPath + "teachers.txt");
	}
	public static boolean saveStudent() {
		return ReaderWriter.serialize(student,fullPath + "students.txt");
	}
	public static boolean saveManager() {
		return ReaderWriter.serialize(manager,fullPath + "managers.txt");
	}


}
