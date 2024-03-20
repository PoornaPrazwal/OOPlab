class Parent {
   
    void display(int num) {
        System.out.println("Parent class display(int): " + num);
    }
    
  
    void display(int num1, int num2) {
        System.out.println("Parent class display(int, int): " + num1 + ", " + num2);
    }
}

class Child extends Parent {
    void display(String message) {
        System.out.println("Child class display(String): " + message);
    }
    
    void display(int num1, int num2, int num3) {
        System.out.println("Child class display(int, int, int): " + num1 + ", " + num2 + ", " + num3);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();  
        
        parentObj.display(10);
        parentObj.display(20, 30);
        
        childObj.display("Hello");
        childObj.display(40, 50, 60);
        
        Parent childReference = new Child();
        childReference.display(70); 
        childReference.display(80, 90); 
    }
}
