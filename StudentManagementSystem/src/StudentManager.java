import java.util.*;

public class StudentManager {

    Scanner sc = new Scanner(System.in);
    List<Student> student = new ArrayList<>();

    private Student getStudentById(int id) {
        for (Student s : student) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void addStudent() {
        System.out.println("Enter the Student Details below:");
        System.out.println("id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("marks:");
        int marks = Integer.parseInt(sc.nextLine());
        Student s = new Student(id, name, age, marks);
        student.add(s);
        System.out.println("Student Added Successfully");
    }

    public void viewStudent() {
        int id;
        while (true) {
            try {
                System.out.println("Enter the Student Id to view the Details: ");
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number for ID!!!");
            }
        }
        Student s = getStudentById(id);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("Student Not Found!!!");
        }
    }

    public void DeleteStudent() {
        int id;
        while (true) {
            try {
                System.out.println("Enter the Id of the student to Delete: ");
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a Vlid Number for ID!!!");
            }
        }
        Student s = getStudentById(id);
        if (s != null) {
            student.remove(s);
            System.out.println("Student Deleted Successfully");
        } else {
            System.out.println("Student Not Found!!!");
        }
    }

    public void SearchStudent() {
        boolean found = false;
        System.out.println("Enter the student Name:");
        String name = sc.nextLine();
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found: " + student.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student Not Found!!!");
        }
    }

    public void UpdateStudent() {
        boolean running = true;
        int id;
        while (true) {
            try {
                System.out.println("Enter the student id to Edit the Details: ");
                id = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a Valid Number of ID!!!");
            }
        }
        Student s = getStudentById(id);
        if (s != null) {
            while (running) {
                int option;
                while (true) {
                    try {
                        System.out
                                .println("Choose the option that u want to Update or choose exit to save details");
                        System.out.println("1. Name");
                        System.out.println("2. Age");
                        System.out.println("3. Marks");
                        System.out.println("4. exit");
                        option = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a Valid Number for Option!!!");
                    }
                }
                switch (option) {
                    case 1:
                        System.out.println("Enter the name: ");
                        String name = sc.nextLine();
                        s.setName(name);
                        System.out.println("Name updated Successfully!!!");
                        break;
                    case 2:
                        int age;
                        while (true) {
                            try {
                                System.out.println("enter the Age: ");
                                age = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Enter valid number for Age!!!");
                            }
                        }
                        s.setAge(age);
                        System.out.println("Age updated successfully!!!");
                        break;
                    case 3:
                        int marks;
                        while (true) {
                            try {
                                System.out.println("enter the Marks: ");
                                marks = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Enter a valid number for the marks!!!");
                            }
                        }
                        s.setMarks(marks);
                        System.out.println("Marks updated Successfully!!!");
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Enter valid input!!!");
                        break;
                }
            }
        } else {
            System.out.println("Student Not found!!!");
        }
    }
}