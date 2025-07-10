package Day14;
class Student {
  private  int age;
     private String name;

     //getter method
     public String getName(){
         return name;
     }
     //setter method
    public void setName(String newName){
         name=newName;
    }
// getter method
    public int getAge() {
        return age;
    }
// setter method
    public void setAge(int age) {
        this.age = age;
    }
}
public class EncapEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(32);
        s.setName("selva");
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
