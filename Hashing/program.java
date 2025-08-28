import java.util.*;

public class program {

    static void HashMapMethods() {
        Map<String, Integer> mp = new HashMap<>();

        // Adding Elements
        mp.put("Akash", 21);
        mp.put("yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // Getting value of key from the HashMap
        System.out.println(mp.get("yash"));       // 16
        System.out.println(mp.get("Rahul"));      // null

        // Changing/updating value of a key in the HashMap
        System.out.println(mp.put("Akash", 25));  // returns previous value: 21

        // Removing a pair from the HashMap
        System.out.println(mp.remove("Akash"));   // 25 (value removed)
        System.out.println(mp.remove("Riya"));    // null

        // Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); // false (we just removed it)
        System.out.println(mp.containsKey("Yash"));  // false (case-sensitive check)

        // Adding a new entry only if the key doesn't exist
        mp.putIfAbsent("Yashika", 30);  // will be added
        mp.putIfAbsent("Yash", 30);     // will be added (because "Yash" is new, different from "yash")

        // Get all keys in the HashMap
        System.out.println(mp.keySet());

        // Get all values in the HashMap
        System.out.println(mp.values());

        // Get all entries in the HashMap
        System.out.println(mp.entrySet());

        //Traversing all enteries of HashMap - multiple methods
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }

        System.out.println();

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
        }

        System.out.println();

        for(var e : mp.entrySet()){
             System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();  // Don't forget to call the method!
    }
}
