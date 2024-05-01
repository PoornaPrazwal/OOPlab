import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List (ArrayList)
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Queue (LinkedList)
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Task 1");
        myQueue.add("Task 2");
        myQueue.add("Task 3");

        // HashMap
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Apple", 10);
        myMap.put("Banana", 20);
        myMap.put("Orange", 15);

        // Accessing elements from List
        System.out.println("First fruit in the list: " + myList.get(0));

        // Accessing and removing elements from Queue
        System.out.println("Processing tasks from the queue:");
        while (!myQueue.isEmpty()) {
            System.out.println("Processing: " + myQueue.poll());
        }

        // Accessing values by keys from HashMap
        System.out.println("Value of 'Apple': " + myMap.get("Apple"));

        // Iterating through the List
        System.out.println("All fruits in the list:");
        for (String fruit : myList) {
            System.out.println(fruit);
        }

        // Iterating through the HashMap
        System.out.println("All key-value pairs in the map:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element from List
        myList.remove("Banana");
        System.out.println("After removing 'Banana' from the list: " + myList);

        // Removing a key-value pair from HashMap
        myMap.remove("Orange");
        System.out.println("After removing 'Orange' from the map: " + myMap);
    }
}
