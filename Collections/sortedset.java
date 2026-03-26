import java.util.*;

public class sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        // INSERT
        set.add(50);
        set.add(10);
        set.add(30);

        // TRAVERSAL (sorted automatically)
        System.out.println("SortedSet elements:");
        for (int i : set) {
            System.out.println(i);
        }

        // SEARCH
        System.out.println("Searching 10: " + set.contains(10));

        // DELETE
        set.remove(30);
        System.out.println("After deletion: " + set);

        // UPDATE
        set.remove(50);
        set.add(60);
        System.out.println("After update: " + set);
    }
}