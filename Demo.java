//cannot call super() more than once in a constructor
class Parent {
    Parent(int x) {
        System.out.println("Parent constructor: " );
    }
}

class Child extends Parent {
    Child() {
        super(10);  //Valid
        // super(20);    //Not Valid
        System.out.println("Child constructor");
    }
}

public class Demo{
    public static void main(String[] args) {
        Child c = new Child();
    }
}

