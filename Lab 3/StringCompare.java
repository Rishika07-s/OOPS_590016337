public class StringCompare {
     public static void main(String[] args) {
         java.util.Scanner s = new java.util.Scanner(System.in);
         System.out.println("Enter first string:");
         String str1 = s.nextLine();
         System.out.println("Enter second string:");
         String str2 = s.nextLine();
         if (str1.equals(str2)) {
             System.out.println("Both strings are same");
         } else {
             System.out.println("Strings are not same");
         }
     }
}

