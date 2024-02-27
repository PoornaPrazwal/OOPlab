public class Student {
    
    private String fullName;
    private int rollNum;
    private double semPercentage;
    private String collegeName;
    private int collegeCode;


    public Student(String fullName, int rollNum, double semPercentage, String collegeName, int collegeCode) {
        this.fullName = fullName;
        this.rollNum = rollNum;
        this.semPercentage = semPercentage;
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
    }

    /
    public String getFullName() {
        return fullName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public double getSemPercentage() {
        return semPercentage;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getCollegeCode() {
        return collegeCode;
    }

    
    
    protected void finalize() throws Throwable {
    
        super.finalize();
    }

    
    public static void main(String[] args) {
        
        Student student1 = new Student("G.Poorna Prazwal", 549, 8.00, "MVGR COLLEGE OF ENGINEERING", 33);


        System.out.println("Full Name: " + student1.getFullName());
        System.out.println("Roll Number: " + student1.getRollNum());
        System.out.println("Semester Percentage: " + student1.getSemPercentage());
        System.out.println("College Name: " + student1.getCollegeName());
        System.out.println("College Code: " + student1.getCollegeCode());
    }
}