import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager studentmanager = new StudentManager();
        boolean running = true;
        while (running) {
            System.out.println("Choose the Option no: ");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1:
                        studentmanager.addStudent();
                        break;
                    case 2:
                        studentmanager.viewStudent();
                        break;
                    case 3:
                        studentmanager.DeleteStudent();
                        break;
                    case 4:
                        studentmanager.SearchStudent();
                        break;
                    case 5:
                        studentmanager.UpdateStudent();
                        break;
                    case 6:
                        running = false;
                        break;
                    default:
                        System.out.println("enter valid input!!!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a Valid Number!!!");
            }
        }

        sc.close();
    }
}
