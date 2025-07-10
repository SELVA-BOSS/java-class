package Day10;

public class ConsExample {
    int a,b,c;
    //class name is should be a  constructor name
    //no return type
    ConsExample(int a, int b){
        a=100;
        b=200;
        c=a+b;
        System.out.println(c);
    }
    ConsExample(int i)
    {
         i=50;
      int b=70;
        c=40;
        System.out.println(i+c);
    }
    ConsExample(int x, int y, int z){
      int a = 30;
      int b= 80;
      c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args ){
        //object  itself take the call
        //no need to call explicitly
        ConsExample c = new ConsExample(20,30);// so always method value
        ConsExample c1= new ConsExample(90);
        ConsExample c2= new ConsExample (40,40,50);




    }
}
