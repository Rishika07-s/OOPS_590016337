import java.util.Scanner;
class Number{
    int m;
}
class B extends Number {
    int n;
    B() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        this.n = s.nextInt();
        System.out.print("Enter value of m: ");
        super.m = s.nextInt();
        System.out.println("Value of n is " + this.n);
        System.out.println("Value of m is " + super.m);
    }
}
public class Keyword{
    public static void main(String[] args) {
        new B();   
    }
}
