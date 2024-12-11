package UniversitySystem.src.Views;

import UniversitySystem.src.Controllers.AdminController;
import UniversitySystem.src.Models.Enums.UserType;

import java.util.Scanner;


public class AdminView {

	private static Scanner in = new Scanner(System.in);
	public static void welcome() {
		System.out.println("Welcome to WSP!\nPlease select the option:");
		System.out.println("1. Create a new user;");
		System.out.println("2. Remove a user;");
		System.out.println("3. Exit;");

		int option = in.nextInt();

		if (option == 1) {

		}
	}
	public static void createUser() {
		System.out.println("What role do you want to create?");
		System.out.println("1. Teacher");
		System.out.println("2. Student");
		System.out.println("3. Manager");
		int option = in.nextInt();
		if (option == 1) {
			System.out.println("Creating a new teacher");
			System.out.println("Enter teacher name:");
			String name = in.next();
			System.out.println("Enter teacher password:");
			String password = in.next();

			boolean res = AdminController.addUser(name,password, UserType.TEACHER);
			if(res){
				System.out.println("Teacher created");
		}else{
				System.out.println("Teacher not created");
			}
			welcome();


		}
		else if (option == 2) {
			System.out.println("Creating a new student");
			System.out.println("Enter student name:");
			String name = in.next();
			System.out.println("Enter student password:");
			String password = in.next();

			boolean res = AdminController.addUser(name,password, UserType.STUDENT);
			if(res){
				System.out.println("Student created");
			}else{
				System.out.println("Student not created");
			}
			welcome();


		}
		else if (option == 3) {
			System.out.println("Creating a new manager");
			System.out.println("Enter manager name:");
			String name = in.next();
			System.out.println("Enter manager password:");
			String password = in.next();

			boolean res = AdminController.addUser(name,password, UserType.MANAGER);
			if(res){
				System.out.println("New Manager created");
			}else{
				System.out.println("Manager not created");
			}
			welcome();


		}
	}
	public static void removeUser() {
		System.out.println("What role do you want to remove?");
		System.out.println("1. Teacher");
		System.out.println("2. Student");
		System.out.println("3. Manager");
		int option = in.nextInt();
		if (option == 1) {
			System.out.println("Removing a teacher");
			System.out.println("Enter teacher name:");
			String name = in.next();
			System.out.println("Enter teacher password:");
			String password = in.next();
			boolean res = AdminController.removeUser(name,password, UserType.TEACHER);
			if(res){
				System.out.println("Teacher removed");
			}else{
				System.out.println("Teacher not removed");
			}
			AdminView.welcome();




		}
		else if (option == 2) {
			System.out.println("Removing a student");
			System.out.println("Enter student name:");
			String name = in.next();
			System.out.println("Enter student password:");
			String password = in.next();
			boolean res = AdminController.removeUser(name,password, UserType.STUDENT);
			if(res){
				System.out.println("Student removed");
			}else{
				System.out.println("Student not removed");
			}
			AdminView.welcome();

		}
		else if (option == 3) {
			System.out.println("Removing a Manager");
			System.out.println("Enter manager name:");
			String name = in.next();
			System.out.println("Enter manager password:");
			String password = in.next();
			boolean res = AdminController.removeUser(name,password, UserType.MANAGER);
			if(res){
				System.out.println("Manager removed");
			}else{
				System.out.println("Manager not removed");
			}
			AdminView.welcome();
		}
	}
}
