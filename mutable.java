public class MutableImmutableExample {
    public static void main(String[] args) {
        // Demonstrating mutable behavior with primitive types
        int mutableInt = 30;
        System.out.println("Value of mutableInt: " + mutableInt + "\nAddress of mutableInt: " + System.identityHashCode(mutableInt));
        mutableInt = 300;
        System.out.println("Value of mutableInt: " + mutableInt + "\nAddress of mutableInt: " + System.identityHashCode(mutableInt));

        double mutableDouble = 30.3;
        System.out.println("Value of mutableDouble: " + mutableDouble + "\nAddress of mutableDouble: " + System.identityHashCode(mutableDouble));
        mutableDouble = 3.303030;
        System.out.println("Value of mutableDouble: " + mutableDouble + "\nAddress of mutableDouble: " + System.identityHashCode(mutableDouble));

        // Demonstrating immutable behavior with String
        String immutableString = "Prazwal";
        System.out.println("Value of immutableString: " + immutableString + "\nAddress of immutableString: " + System.identityHashCode(immutableString));
        immutableString = "Prazwal";
        System.out.println("Value of immutableString: " + immutableString + "\nAddress of immutableString: " + System.identityHashCode(immutableString));
    }
}
