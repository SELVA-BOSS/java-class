package Day14;

public class DataConv {
    public static void main(String[] args) {
        String num = "1000";
        String name= "selva";
        // data conversion string num to int num
        int n=Integer.parseInt(num);
        System.out.println(n);

        //we cannot convert from string(letter form) to integer but error will not show while coding and running
        int na= Integer.parseInt(name);
        System.out.println(na);
    }
}
