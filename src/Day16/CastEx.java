package Day16;
class Father {
    void disp(){
        System.out.println("good father");
    }
}
class Child extends Father {
    void play(){
        System.out.println("son is playing");
    }
}
public class CastEx {
    public static void main(String[] args) {
        Child c = new Child();
        c.play();
        Father f = new Father();
        f.disp();
        // this normal method when we dnt  extends ..need to create object for both and to access both classes
        Father f1= c; //upcasting
        
        Child c1=(Child)f; // down casting

    }
}
