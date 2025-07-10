package Day17;

import java.util.ArrayList;

public class ArrayListex {
    public static void main(String[] args) {
       // need to create array list like object then we can add multiple data types
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("selva");
        list.add(12.12);
        list.add(true);
        list .add('c');
        list.add("selva");
        list.add(100);
        list.add(null);

        // here allowing sequence , duplicate value, null value also allowing
        System.out.println(list);

        // method to perform like string
        System.out.println(list.isEmpty());//no empty
        System.out.println(list.contains(100));//true becoz 100 is thr in d list
        System.out.println(list.remove(1));// removed selva as 1
        System.out.println(list);
        // we one create another arraylist
        //using addall method we can access list one to another

        ArrayList list1 = new ArrayList();
        list1.addAll(list);
        System.out.println(list1);

    }
}
