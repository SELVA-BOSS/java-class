package Day19;


import java.util.HashMap;

public class HashMapex {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("selva",1992);
        hm.put('c',2000);
        hm.put("selva",1000);
        hm.put(null,5000);
        hm.put(null,4000);
        hm.put(2300,3400);
        hm.put(4500,"selbin");
        System.out.println(hm);//same key and diff values .it takes only second value
        //no sequence order
        //allowing one null in key
//        System.out.println(hm.put(2,1));
//        System.out.println(hm.isEmpty());
//        System.out.println(hm.containsKey('c'));
//        System.out.println(hm.entrySet());
    }
}
