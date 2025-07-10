package Day10;
// allows class to access properties and behaviours from another class(fields n methods)
//implementing using the 'extends' keyword
//inheritance example
class parent{
        int a=100;
        int b=200;
        void sum() {
            int c = a + b;
            System.out.println(c);
        }
}
public class InheritanceEx extends parent {
    protected void add(){
        a=1000;
        b=2000;
        int c=a+b;
        System.out.println(c);
        sum();
    }
    public static void main(String[] args){
        InheritanceEx i=new InheritanceEx();
        i.sum();//o/p is 300 from class parent
        i.sum();
    }
}
