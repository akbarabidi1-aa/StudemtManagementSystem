public class Student {

    private int rollNo;
    private String name;
    private double marks;
    private String grade;
    private String performance;
    private boolean enrolled;

    // Constructor
    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.enrolled = true; /
        calculateGradeAndPerformance();
    }
    private void calculateGradeAndPerformance() {
        if (marks >= 85) {
            grade = "A";
            performance = "Excellent";
        } else if (marks >= 70) {
            grade = "B";
            performance = "Good";
        } else if (marks >= 50) {
            grade = "C";
            performance = "Average";
        } else {
            grade = "F";
            performance = "Poor";
        }
    }

    public int getRollNo() {
        return rollNo;   }
  public void display() {
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Name         : " + name);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + grade);
        System.out.println("Performance  : " + performance);
        System.out.println("Enrollment   : " + (enrolled ? "Enrolled" : "Not Enrolled"));
        System.out.println("---------------------------------");
    }
}
