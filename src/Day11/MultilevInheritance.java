package Day11;
   //multilevel inheritance e.g - a->b->c
class Aa
{
    void subtraction()
    {
        int a=100;
        int b=200;
        int c=b-a;
        System.out.println(c);
    }
}
class Ba extends Aa{
    void sum()
    {
       int a=20;
        int b=30;
        int x=a+b;
        System.out.println(x);
    }
}
class Ca extends Ba
{
    void multiple (){
        int i=10;
        int j =40;
        int k =i*j;
        System.out.println(k);
    }
}
public class MultilevInheritance {
    public static void main(String[] args){
        Ca c=new Ca();
        c.sum();
        c.multiple();
        c.subtraction();
    }
}
