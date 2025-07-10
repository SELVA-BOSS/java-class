package Day08;

public class ClassExample {
        int tea = 10;
        int coffee = 20;
        int idly = 50;
         public static void main(String[] args ){

             //syntax for creating an object for a class

             ClassExample server1 = new ClassExample ();
             System.out.println(server1.tea);
             ClassExample server2 = new ClassExample ();
             System.out.println(server2.coffee);
             ClassExample server3 = new ClassExample();
             System.out.println(server3.idly);
             //we can create many object for same class
             //we create object to access the class method

         }

}
