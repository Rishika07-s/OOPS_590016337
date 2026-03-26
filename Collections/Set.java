
import java.util.*;

public class Set {
    public static void main(String[] args) {
        java.util.Set<Integer> set = new HashSet<>();

        // INSERT
        set.add(10);
        set.add(20);
        set.add(30);

        // TRAVERSAL
        System.out.println("Set elements:");
        for (int i : set) {
            System.out.println(i);
        }

        // SEARCH
        System.out.println("Searching 20: " + set.contains(20));

        // DELETE
        set.remove(10);
        System.out.println("After deletion: " + set);

        // UPDATE (remove + add)
        set.remove(20);
        set.add(25);
        System.out.println("After update: " + set);
    }
}