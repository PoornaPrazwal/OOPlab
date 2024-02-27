public class Student {
    private String fullName;
    private double semPercentage;
    private String collegeName;
    private int collegeCode;

    
    public Student() {
        this.collegeName = "MVGR";
        this.collegeCode = 33;
    }

    
    public Student(String fullName, double semPercentage) {
        this.fullName = fullName;
        this.semPercentage = semPercentage;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester Percentage: " + semPercentage);
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
        System.out.println();  
    }

    
    public static void main(String[] args) {
        
        Student defaultStudent = new Student();
        defaultStudent.displayDetails();

    
        Student parameterizedStudent = new Student("G.Poorna Prazwal", 8.00);
        parameterizedStudent.displayDetails();
    }
}
