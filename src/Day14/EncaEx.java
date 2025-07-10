package Day14;

class Father{
   private String son;
   private int age ;

    public String getSon() {
        return son;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSon(String son) {
        this.son = son;
    }
}
public class EncaEx {
    public static void main(String[] args) {
        Father f=new Father();
        f.setAge(30);
        System.out.println(f.getAge());
        f.setSon("selbin");
        System.out.println(f.getSon());
    }
}
