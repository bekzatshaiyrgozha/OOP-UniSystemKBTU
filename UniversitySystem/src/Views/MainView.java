package UniversitySystem.src.Views;

import UniversitySystem.src.Controllers.UserController;
import UniversitySystem.src.Models.Person.Manager;
import UniversitySystem.src.Models.Person.Student;
import UniversitySystem.src.Models.Person.Teacher;
import UniversitySystem.src.Models.Person.User;

import java.util.List;
import java.util.Scanner;

public class MainView {

    private static Scanner input = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Welcome to WSP!\nSelect your role:");
        System.out.println("1. Teacher");
        System.out.println("2. Manager");
        System.out.println("3. Student");


        int option = input.nextInt();
        input.nextLine();

        switch (option) {
            case 1:
                authorize("teachers.txt");
                TeacherView.welcome();
                break;
            case 2:
                authorize("managers.txt");
                ManagerView.welcome();
                break;
            case 3:
                authorize("students.txt");
                StudentView.welcome();
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                welcome();
        }
    }

    public static void authorize(String fileName) {
        System.out.println("Please enter your credentials:");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        // Барлық пайдаланушыларды алу (мысалы, оларды файлдан жүктеу немесе деректер базасынан алу)
        List<User> users = UserController.loadUsers(fileName);

        // Пайдаланушыны тексеру
        boolean found = false;

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                found = true;

                // Рөлге байланысты көру бетіне өту
                if (user instanceof Teacher) {
                    System.out.println("Welcome, Teacher!");
                    TeacherView.welcome();
                } else if (user instanceof Manager) {
                    System.out.println("Welcome, Manager!");
                    ManagerView.welcome();
                } else if (user instanceof Student) {
                    System.out.println("Welcome, Student!");
                    StudentView.welcome();
                } else {
                    System.out.println("Unknown user type.");
                }

                break; // Пайдаланушы табылды, циклды тоқтатамыз
            }
        }

        // Егер пайдаланушы табылмаса
        if (!found) {
            System.out.println("Invalid credentials. Please try again.");
            welcome(); // Қайтадан бастапқы мәзірге ораламыз
        }
    }
}