package Day11;

    //single inheritance - type

        //Superclass

class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

// Main class
public class Inhexle {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // subclass method
    }
}
