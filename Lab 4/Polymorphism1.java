class Animal {

    // Method Overloading 
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String type) {
        System.out.println("Animal sound type: " + type);
    }
}

// Method Overriding 
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism1 {

    public static void main(String[] args) {

        // Runtime Polymorphism 
        Animal a = new Dog();
        a.sound();  

        // Compile-time Polymorphism 
        a.sound("Loud");
    }
}
