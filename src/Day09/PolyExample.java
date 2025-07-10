package Day09;

public class PolyExample {
     int a,b,c;
//class variables

    void add()
    {
        //we can use class variables in any methods. tats why we use same a' here too
        a=10;
        b=20;
        c=30;
        System.out.println(a+b+c);
    }
    void add(int a, int b)
    {
        a = 1000;
        b = 2000;
        c = 4000;
        System.out.println(a+b);
    }
    void add(int a, int b , int c )
    {
        a=100;
        b=200;
        c=300;
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        PolyExample pe = new PolyExample();
        pe.add(1000,2000);
        pe.add(100,200,300);
        pe.add();

    }
}
