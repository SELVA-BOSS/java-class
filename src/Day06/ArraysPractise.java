package Day06;

public class ArraysPractise {
    public static void main(String[] args) {
        double a[]={105.56,250.58,30.67,95.23};
        double length=a.length;
//        single reading
//        System.out.println(a[1]);//ans : 250.58
//        for multiple reading
        for(int i=0;i<a.length;i++)//here we didnt use double coz i=0 is int value
        {
            System.out.println(a[i]);
        }

    }
}
