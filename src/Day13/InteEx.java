package Day13;
class Movie implements Good,Bad,Ugly {

    @Override
    public void kill() {
        System.out.println("villain");
    }


    @Override
    public void display() {
        System.out.println("worse");
    }

    @Override
    public void violence() {
        System.out.println("action");
    }
}

public class InteEx {
    public static void main(String[] args) {
     Movie m=new Movie();
     m.display();
     m.violence();
     m.kill();
    }
}
