package Day13;
interface A{
    void display();
}
interface B{
    void display();
}
class C implements A,B{
    public void display(){
        System.out.println("class c");
    }
}
public class MultipleInheri {
    public static void main(String[] args) {
         C c1 = new C();
         c1.display();


    }
}
