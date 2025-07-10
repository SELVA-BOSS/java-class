package Day07;

public class StringbuffEx {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("selva");
        StringBuffer str1 = new StringBuffer("bindu");
       // System.out.println(str.reverse());
        System.out.println(str.append(str1));
        System.out.println(str.reverse());
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,3));

    }
}
