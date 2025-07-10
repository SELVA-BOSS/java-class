package Day13;

interface Animal {
    void sound();
        int mark=10;
}
class cat implements Animal
{
 public void sound (){
     System.out.println("meow");
 }

}
public class InterfaceEx {
    public static void main(String[] args) {
        cat c=new cat();
        c.sound();
        System.out.println(c.mark);


    }
}
