package Day19;

import java.util.LinkedHashMap;

public class LinkedHashmapex {
    public static void main(String[] args) {
        LinkedHashMap link = new LinkedHashMap();
        link.put("selva",1992);
        link.put('c',2000);
        link.put("selva",1000);
        link.put(null,5000);
        link.put(null,4000);
        link.put(2300,3400);
        link.put(4500,"selbin");
        System.out.println(link);
        //sequence order
        //one null value
        System.out.println(link.size());
        System.out.println(link.remove(2,1));
        System.out.println(link);
        System.out.println(link.remove("selva"));
    }
}
