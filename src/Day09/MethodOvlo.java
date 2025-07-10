package Day09;

public class MethodOvlo {

    void sum(int a, int b)
    {

        System.out.println(a+b);
    }

    void sum(int a)
    {
        System.out.println("selva");
    }
    void sum(int a , int b, int c)
    {
        System.out.println(a+b+c);

    }
        public static void main(String[] args)
        {

        MethodOvlo m1=new MethodOvlo();
        m1.sum(10,20);
        m1.sum(10,20,30);
        m1.sum(20);
        }

}
