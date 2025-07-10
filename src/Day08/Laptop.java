package Day08;

public class Laptop {
    // class is template, we create object , through object we access the class
    String name = "lenovo";
    int price = 40000;
    int ram =6;
    String proc= "i5";

    public static void main(String[] args) {
        Laptop lap1 = new Laptop ();
        lap1.name = " lenovo";
        lap1.price =40000;
        lap1.ram = 6;
        lap1.proc = "i5";
        System.out.println(lap1.name);

        Laptop lap2 = new Laptop();
        lap2.price = 70000;
        System.out.println(lap2.price);

    }

}
