import java.util.Scanner;

public class PrintArr {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array");
        n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("The elements of array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

