package Day09;

public class OverLoadingex {
    int a =10;
    double d = 400.50;
    int b= 30;
//class variable on top .for eg a,d,b
    void multiple()
    {
        System.out.println(a*b);
    }
    void multiple(int a,int b,double d)
    {
        a=100;
        b=200;
        d=30;
        System.out.println(a*d*b);
    }
    void multiple (int a, double d)
    {
        //local variables
        a = 100;
        d=40;
        System.out.println(a*d);
    }
    public static void main(String[] args){
        OverLoadingex ol= new OverLoadingex();
        ol.multiple();
        ol.multiple(100,400.50);
        ol.multiple(10,20,30);//here i changed value for a,b,d, we get output this only assigned value
    }
}
