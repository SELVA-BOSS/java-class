package Day18;

import java.util.HashSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("selva");
        hs.add(true);
        hs.add("www");
        System.out.println(hs);
        System.out.println(hs.isEmpty());//no empty so false
        System.out.println(hs.iterator());
        System.out.println(hs.size());
        System.out.println(hs.spliterator());
        System.out.println(hs.hashCode());
        System.out.println();
    }
}
