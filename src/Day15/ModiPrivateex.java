package Day15;
class friend {
    //in this class we have two methods
    //one is private
    //one is public or default or protected

    private String name = "john";
    private void play(){
        System.out.println("my friend is playing");
    }
     protected void sing(){
         System.out.println("my friend is singing");
     }
}
public class ModiPrivateex {
    public static void main(String[] args) {
        friend f = new friend();
        // here i cannot call play method coz method is in private so
        // we cannot access from outside if the class
        //now i call method sing
        f.sing();
    }
}
