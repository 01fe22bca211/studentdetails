public class Student_Info {

    String sem[] = {"1stsem", "2ndsem", "3rdsem"};
    double marks[] = {9.14, 9.07, 9.07}; // Corrected the closing parenthesis
    
    public void stud_info() {
        System.out.println("\nGrade obtained from the semester\n"); // Removed 's:' from the print statement

        for (int i = 0; i < 3; i++) {
            System.out.println(sem[i] + ": Grade: " + marks[i]); // Added space after colon
        }
    }
    
    public static void main(String[] args) {
        Student_Info studentInfo = new Student_Info();
        studentInfo.stud_info();
    }
}