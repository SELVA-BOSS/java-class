package Day08;

public class Claobj {
    String name = "selva";
    int age = 32;
    float height =5.10f;
    int weight = 90;
    boolean isselvagood = true;
    char grade = 'A';

    public static void main (String[] args ){
        Claobj bio = new Claobj ();
        //through object we access the class, here object name is bio
        System.out.println(bio.name);
        System.out.println(bio.age);
        System.out.println(bio.height);
        System.out.println(bio.grade);
        System.out.println(bio.weight);
    }


}
