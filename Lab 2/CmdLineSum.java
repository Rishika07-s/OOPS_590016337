import java.util.Scanner;
public class CmdLineSum {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[] arr = new int[size];
        int sum=0;
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}