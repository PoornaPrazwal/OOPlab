public class BoxingUnboxingExample {
    public static void main(String[] args) {
        // Boxing: converting int to Integer
        int numInt = 10;
        Integer numInteger = Integer.valueOf(numInt); // Boxing

        // Unboxing: converting Integer to int
        int numUnboxed = numInteger.intValue(); // Unboxing

        System.out.println("Boxed Integer: " + numInteger);
        System.out.println("Unboxed int: " + numUnboxed);

        // Autoboxing: implicitly converting int to Integer
        Integer autoboxedInteger = numInt; // Autoboxing

        // Autounboxing: implicitly converting Integer to int
        int autounboxedInt = numInteger; // Autounboxing

        System.out.println("Autoboxed Integer: " + autoboxedInteger);
        System.out.println("Autounboxed int: " + autounboxedInt);
    }
}
