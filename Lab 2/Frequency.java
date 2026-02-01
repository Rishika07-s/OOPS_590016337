import java.util.Arrays;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " occurs " + count);
                count = 1;
            }
        }

        // Print last element frequency
        System.out.println(arr[arr.length - 1] + " occurs " + count);
    }
}