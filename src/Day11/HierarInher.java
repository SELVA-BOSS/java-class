package Day11;

class Animmal
{
    void food(){
        System.out.println("animal eats food");
    }
}
class Doggy extends Animmal
{
    void bark()
    {
        System.out.println("dogs will bark");
    }
}
class Cat extends Animmal {
    void meow()
    {
        System.out.println("cats will meow");
    }

}
public class HierarInher {
    public static void main(String[] args ){
        //2 objects for inherits class
        Doggy d=new Doggy();
        d.bark();
        d.food();
        Cat c=new Cat();
        c.meow();
        c.food();


    }
}
