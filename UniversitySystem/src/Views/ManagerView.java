package UniversitySystem.src.Views;

import java.util.Scanner;

import static UniversitySystem.src.Controllers.ManagerController.addCourse;
import static UniversitySystem.src.DLL.DBContext.manager;


public class ManagerView {
    private static Scanner in = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Manager system ");
        System.out.println("1. Add Courses");
        System.out.println("2. Exit;");

        int option = in.nextInt();
        switch (option) {
            case 1:
                addCourse();
                break;
            case 2:
                MainView.welcome();

        }







    }
}
