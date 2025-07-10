package Day15;
class Love{
    //here no access modifier defined so its default
    void lover(){
        System.out.println("love is love");
    }
}
class Fail{
    void failure(){
        System.out.println("love is failure");
    }
}
public class Modidefaultex {
    public static void main(String[] args) {
        Love l=new Love();
        l.lover();
        Fail f = new Fail();
        f.failure();
        //we access inside package

    }
}
