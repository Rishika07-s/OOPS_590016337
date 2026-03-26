import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // INSERT
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // TRAVERSAL
        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // SEARCH
        System.out.println("Search key 2: " + map.containsKey(2));

        // DELETE
        map.remove(1);
        System.out.println("After deletion: " + map);

        // UPDATE
        map.put(2, "Mango");
        System.out.println("After update: " + map);
    }
}