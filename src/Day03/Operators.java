package Day03;

public class Operators {
    public static void main(String[] args ){
        //arithmetic operator +-*/
        int a=100;
        int b=200;
        int c=a+b;
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);

        //relational (comparision) op equal,not equal, greater than ,less than, greaterthan or equal, less than or equal

        int a1=10;
        int b1=20;
        System.out.println(a1 == b1);//false
        System.out.println(a1 != b1);//true
        System.out.println(a1>b1);//false
        System.out.println(a1<b1);//true
        System.out.println(a1>=b1);//false
        System.out.println(a1<=b1);//true

        //logical operator &&,||, ! (AND,OR,NOT)

        boolean result =10>5 && 15>5;
        System.out.println(result);//true
        boolean results =10>5 || 15>50;
        System.out.println(results);//true

        //inc/dec pre inc, post inc, pre dec, post dec

       int i=11;
       int j=22;
       int k= i + j + i++ + j++ + ++i + ++j;
       // k= 11+22+11+22+13+24
        System.out.println(k);//103

        int k1= i - j - i-- - j-- + ++i + ++j;//-11
        System.out.println(k1);

        //assignment operator











    }
}
