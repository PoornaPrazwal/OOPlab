class Parent {
    
    void display() {
        System.out.println("Parent class display()");
    }
}

class Child extends Parent {
    
    void display() {
        System.out.println("Child class display()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parentObj = new Parent(); 
        Parent childObj = new Child(); 
        parentObj.display(); 
        childObj.display();  
    }
}
