public class Student extends Student_Info{

    String name; // Removed the initialization here
    
    int age;
    
    String month;
    
    int date;
    
    int year;
    
    public Student(int date, String month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public void read() {
        System.out.println("Date of birth of the Student is " + date + "/" + month + "/" + year);
    }
    
    public static void main(String[] args) {
        Student s = new Student(15, "Feb", 2005); // Corrected the syntax for creating a new Student object
        s.name = "vaishali"; // Set the name separately
        s.age = 19; // Set the age separately
        s.display();
        s.read();
        s.stud_info();
    }
}