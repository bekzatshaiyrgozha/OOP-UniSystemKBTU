package UniversitySystem.src.Controllers;


import UniversitySystem.src.DLL.DBContext;
import UniversitySystem.src.Models.Enums.UserType;
import UniversitySystem.src.Models.Person.Manager;
import UniversitySystem.src.Models.Person.Student;
import UniversitySystem.src.Models.Person.Teacher;

public class AdminController {
	public boolean createTeacher(String userName, String password) {
		Teacher teacher = new Teacher(userName, password);
		DBContext.teacher.add(teacher);
		DBContext.saveTeacher();
		return true;
	}


	public static boolean addUser(String username, String password, UserType userType) {
		switch (userType) {
            case STUDENT:
				Student newstudent = new Student(username, password);
				DBContext.student.add(newstudent);
				return DBContext.saveStudent();
            case TEACHER:
				Teacher newteacher = new Teacher(username, password);
				DBContext.teacher.add(newteacher);
				return DBContext.saveTeacher();
            case MANAGER:
				Manager newmanager = new Manager(username, password);
				DBContext.manager.add(newmanager);
				return DBContext.saveManager();

            default:
				return false;
        }
    }
	public static boolean removeUser(String username, String password, UserType userType) {
		switch (userType) {
			case STUDENT:
				Student student = new Student(username, password);
				DBContext.student.remove(student);
				return DBContext.saveStudent();
			case TEACHER:
				Teacher teacher = new Teacher(username, password);
				DBContext.teacher.remove(teacher);
				return DBContext.saveTeacher();
			case MANAGER:
				Manager manager = new Manager(username, password);
				DBContext.manager.remove(manager);
				return DBContext.saveManager();
			default:
				return false;
		}
	}


}
