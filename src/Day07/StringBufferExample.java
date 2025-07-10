package Day07;

public class StringBufferExample {
    public static void main(String[] args )
    {
        StringBuffer  str = new StringBuffer ("Hello");
        System.out.println(str);
        // append is used to add text
//        str.append("selva");
//        System.out.println(str);
        char c = str.charAt(1);
        System.out.println(c);
        System.out.println(str.substring(0));
        System.out.println(str.reverse());
        System.out.println(str.replace(0,2,"ja"));
    }
}
