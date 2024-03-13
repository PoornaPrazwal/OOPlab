import java.util.Scanner;

public class AccessSpecifierDemo {
    private int priVar;
    protected int proVar;
    public int pubVar;

    // Method to set values for member variables
    public void setVar(int priValue, int proValue, int pubValue) {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }

    // Method to display values of member variables
    public void getVar() {
        System.out.println("Private Variable (priVar): " + priVar);
        System.out.println("Protected Variable (proVar): " + proVar);
        System.out.println("Public Variable (pubVar): " + pubVar);
    }

    public static void main(String[] args) {
        // Create an object of AccessSpecifierDemo
        AccessSpecifierDemo demoObject = new AccessSpecifierDemo();

        // Set values for member variables
        demoObject.setVar(10, 20, 30);

        // Display values of member variables
        demoObject.getVar();
    }
}
