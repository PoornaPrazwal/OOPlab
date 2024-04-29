import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Checked exceptions
        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception: " + e.getMessage());
        }

        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception: " + e.getMessage());
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("nonexistentfile.txt"));
            objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("IO exception or Class not found exception: " + e.getMessage());
        }

        // Unchecked exceptions
        try {
            int[] array = new int[5];
            System.out.println(array[10]); // Accessing an index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length()); // Trying to invoke a method on null reference
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }

        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
}
