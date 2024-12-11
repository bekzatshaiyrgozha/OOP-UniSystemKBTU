package UniversitySystem.src.Controllers;

import UniversitySystem.src.Models.Enums.*;
import UniversitySystem.src.Models.Person.Student;
import UniversitySystem.src.attributes.Course;
import UniversitySystem.src.attributes.Lesson;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import static UniversitySystem.src.DLL.DBContext.manager;
import static UniversitySystem.src.Models.Enums.Faculty.valueOf;

public class ManagerController {
    static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println("Manager System");
        System.out.println("1. Add course");

        String choosing = scanner.nextLine();

        switch (choosing){
            case "1":
                addCourse();
                break;
        }

    }

    public static void addCourse() {
        System.out.println("Add course:");
        System.out.println("Write course name:");
        String name = scanner.nextLine();

        System.out.println("Write number of credits:");
        int credits = scanner.nextInt();

        System.out.println("Write faculty name:");
        Faculty faculty = valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Write course type:");
        CourseType type = CourseType.valueOf(scanner.nextLine().toUpperCase());

        Course course = new Course(name,credits, type, faculty);



    }
}
