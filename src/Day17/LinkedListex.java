package Day17;

import java.util.LinkedList;
// first we have import linkedlist from
public class LinkedListex {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("bindu");
        list.add('b');
        list.add(1995);
        list.add(false);
        list.add(10.55);
        list.add("Bindu");
        list.add(null);
        System.out.println(list.contains(false));
        System.out.println(list.remove(1));
        System.out.println(list);
         LinkedList list1 =new LinkedList();
         list1.addAll(list);
        System.out.println(list1);


    }
}
