package Day17;

import java.util.ArrayList;
import java.util.LinkedList;


public class ListEx {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        // if type arraylist , it will automatically import the util package
        l.add("selva");
        l.add('s');
        l.add(null);
        System.out.println(l);
        LinkedList L=new LinkedList();
        L.addAll(l);
        System.out.println(L);


    }
}
