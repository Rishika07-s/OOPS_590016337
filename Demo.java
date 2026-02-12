//Write a program to show chaining of super()is not allowed in java
class Demo {
    Demo(int x) {
        System.out.println("Parent constructor: " + x);
    }
}

class Child extends Demo {
    Child() {
        super(10);  //Valid
        super(20);    //Not Valid
        System.out.println("Child constructor");
    }
}

public class Demo {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
