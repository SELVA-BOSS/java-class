package Day09;

public class OvLoad {
    int a;
    double d;
    float f;

    void sum()
    {
        a = 100;
        double d= 200.60;
        float f= 2.5f;
        System.out.println(a+f);
    }
    void sum(int a,int b)
    {
         a=5;
         b=20;
        System.out.println(a+b);
    }
    void sum(int a,float f,double d)
    {
        this. a=40;
         f=7.5f;
         d=67.00;
    }
    public static void main(String[] args){
        OvLoad ov= new OvLoad();
        ov.sum();
        ov.sum(40,7.5f,67.00);
        ov.sum(5,20);
    }
}
