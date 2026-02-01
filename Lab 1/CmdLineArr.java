public class CmdLineArr {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
