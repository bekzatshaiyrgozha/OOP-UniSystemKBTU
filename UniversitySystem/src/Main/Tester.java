package UniversitySystem.src.Main;

import UniversitySystem.src.DLL.DBContext;
import UniversitySystem.src.Models.Person.Manager;
import UniversitySystem.src.Models.Person.Student;
import UniversitySystem.src.Models.Person.Teacher;
import UniversitySystem.src.Views.MainView;

import java.util.Vector;

public class Tester {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("t", "123");
        Student student1 = new Student("student1", "password1");
        Manager manager1 = new Manager("m1234", "123");
        Manager manager2 = new Manager("m", "123");
        Manager manager = new Manager("m1234", "123");

        DBContext.teacher.add(teacher1);
        DBContext.student.add(student1);
        DBContext.manager.add(manager2);
        DBContext.manager.add(manager1);

        boolean teacherSaved = DBContext.saveTeacher();
        boolean studentSaved = DBContext.saveStudent();
        boolean managerSaved = DBContext.saveManager();


        Vector<Teacher> loadedTeachers = DBContext.getTeacher();
        Vector<Student> loadedStudents = DBContext.getStudent();
        Vector<Manager> loadedManagers = DBContext.getManager();

        MainView.welcome();


    }
}
