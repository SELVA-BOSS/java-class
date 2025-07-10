package Day13;

//ques is create an interface playable with a method play()
// then create two classes,guitar n piano , that implement the playable interface
//each class implement their own play method
//finally create an main method to object n call their play methods

interface Playable {
void play();
}
class Guitar implements Playable {
   public void play(){
       System.out.println("play guitar");
   }
}
class Piano implements Playable{
    public void play(){
        System.out.println("play piano");
    }
}

public class InterEx {
    public static void main(String[] args) {
    Guitar g=new Guitar();
    g.play();
    Piano p = new Piano();
    p.play();
        System.out.println();

    }
}
