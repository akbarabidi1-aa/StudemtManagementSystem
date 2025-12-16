import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Enroll Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enrollStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Program Closed.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    // Enroll Student
    static void enrollStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(roll, name, marks);
        students.add(s);

        System.out.println("Student Enrolled Successfully!");
    }

    // View Students
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet!");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    // Search Student
    static void searchStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.getRollNo() == roll) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }
}
