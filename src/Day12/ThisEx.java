package Day12;

public class ThisEx {
    String myname=null;

    ThisEx(){
        System.out.println("hello");
        //object will call this constructor
    }
    void setname (String myname)
    {
       this.myname= myname;
       //this keyword refers to the current object in a method or constructor
    }

    public static void main(String[] args) {
        ThisEx t = new ThisEx();//if create object ,one constructor will call automatically
             t.setname("mark");
        System.out.println(t.myname);
    }
}
