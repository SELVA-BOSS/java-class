package Day16;

public class DowncastEx {
    public static void main(String[] args) {
        int i = 17654;
        System.out.println(i);
    // int to byte mean high to low
        // need to use logic (datatype)
        byte b = (byte) i;
        System.out.println(b);
        // output we cannot predict

        long l= 1245676;
        int i1 = (int) l;

    }
}
