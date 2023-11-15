import java.util.HashMap;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the hashtable
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);
        hashMap.put("David", 35);

        // Access values using keys
        System.out.println("Age of Alice: " + hashMap.get("Alice"));
        System.out.println("Age of Bob: " + hashMap.get("Bob"));

        // Check if a key is present
        System.out.println("Is Charlie present? " + hashMap.containsKey("Charlie"));

        // Update a value for a key
        hashMap.put("Alice", 26);
        System.out.println("Updated age of Alice: " + hashMap.get("Alice"));

        // Remove a key-value pair
        hashMap.remove("Bob");
        System.out.println("Bob's age removed. Is Bob present? " + hashMap.containsKey("Bob"));

        // Print all key-value pairs
        System.out.println("All key-value pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
