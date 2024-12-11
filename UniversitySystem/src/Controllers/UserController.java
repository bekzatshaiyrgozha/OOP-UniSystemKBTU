package UniversitySystem.src.Controllers;

import UniversitySystem.src.DLL.DBContext;
import UniversitySystem.src.Models.Enums.UserType;
import UniversitySystem.src.Models.Person.Manager;
import UniversitySystem.src.Models.Person.Student;
import UniversitySystem.src.Models.Person.Teacher;
import UniversitySystem.src.Models.Person.User;


import java.util.List;
import java.util.Vector;

public class UserController {
	public static boolean authorize(String fileName,String username,String password){
		if(fileName.equals("teachers.txt")){
			Vector<Teacher> teachers = (Vector<Teacher>) UserController.getUsers(UserType.TEACHER);
			for(Teacher teacher : teachers){
				if (teacher.getUsername().equals(username) && teacher.getPassword().equals(password)) {
					return true;
				}

			}
		}else if(fileName.equals("students.txt")){
			Vector<Student> students = (Vector<Student>) UserController.getUsers(UserType.STUDENT);
			for(Student student : students){
				if (student.getUsername().equals(username) && student.getPassword().equals(password)) {
					return true;
				}
			}
		}else if(fileName.equals("managers.txt")){
			Vector<Manager> managers = (Vector<Manager>) UserController.getUsers(UserType.MANAGER);
			for(Manager manager : managers){
				if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}



	public static Object getUsers(UserType type){
		switch (type){
			case TEACHER:
				return DBContext.getTeacher();
			case STUDENT:
				return DBContext.getStudent();
			case MANAGER:
				return DBContext.getManager();
			default:
				return null;

		}
	}

	public static List<User> loadUsers(String fileName) {
			return null;
	}
}