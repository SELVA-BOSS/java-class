package Day16;

public class UpcastingEx {
    public static void main(String[] args) {
        //low to high data type
        byte b = 10;
        System.out.println(b);
        // byte to short
        short s = b;
        System.out.println(s);

        short s1 = 130;
        System.out.println(s1);
        //short to int
        int i = s1;
        System.out.println(i);

        int i1 = 1234;
        System.out.println(i1);
        // int to long
        long l = i1;
        System.out.println(l);

        float f = 100.38f;
        System.out.println(f);
        // float to double
        double d = f;
        System.out.println(d);

    }
}
