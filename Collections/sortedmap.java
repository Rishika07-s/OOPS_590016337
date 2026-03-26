import java.util.*;

public class sortedmap {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        // INSERT
        map.put(3, "Cat");
        map.put(1, "Dog");
        map.put(2, "Elephant");

        // TRAVERSAL (sorted by keys)
        System.out.println("SortedMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // SEARCH
        System.out.println("Search key 1: " + map.containsKey(1));

        // DELETE
        map.remove(2);
        System.out.println("After deletion: " + map);

        // UPDATE
        map.put(3, "Tiger");
        System.out.println("After update: " + map);
    }
}