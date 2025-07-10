package Day18;

import java.util.LinkedHashSet;

public class LinkedHashex {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("selbin");
        lhs.add('s');
        lhs.add(120);
        lhs.add(true);
        lhs.add(false);
        lhs.add(12.89);
        lhs.add("selbin");
        lhs.add(null);
        System.out.println(lhs);//sequence order but no duplicate
        //lhs.size();
        System.out.println(lhs.size());//ans 7
    }
}
