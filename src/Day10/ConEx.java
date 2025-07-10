package Day10;

public class ConEx {
    int a; int b;int c;

    ConEx (int a){
        a=10;
        System.out.println(a);
    }
    ConEx (int a, int b, int c)
    {
        a=200;
        b=250;
        c=400;
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        ConEx c = new ConEx(10);
        ConEx c1=new ConEx(200,100,500);


    }
}
