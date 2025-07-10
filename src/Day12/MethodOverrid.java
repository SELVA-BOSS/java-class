package Day12;

class Selva{
    void smile(){

        System.out.println("selva can smile");
    }
}
class Bindu extends Selva {
    void smile()
    {
        System.out.println("bindu also smile");
    }
}
public class MethodOverrid {
    public static void main (String[] args){
        Bindu b=new Bindu();
        b.smile();
        b.smile();

        //here same method same n parameters same but o/p from subclass
    }
}
