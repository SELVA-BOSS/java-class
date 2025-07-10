package Day18;

import java.util.HashSet;

public class HashSetex {
    public static void main(String[] args) {
        HashSet set  = new HashSet();
        set.add("selbin");
        set.add('s');
        set.add(120);
        set.add(true);
        set.add(false);
        set.add(12.89);
        set.add("selbin");
        set.add(null);
        System.out.println(set);//no null,no duplicate,no sequence to allow
        //method
        set.remove(120);//120 removed from set
        System.out.println(set);
        //set.contains('s');
       System.out.println(set.contains('s'));
    }
}
