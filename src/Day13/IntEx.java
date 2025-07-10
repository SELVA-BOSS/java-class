package Day13;
interface Selva{
    void read();
}
interface Bindu {
    void write();
}
interface Selbin{
    void type();
}
class Link implements Selva, Bindu,Selbin{
    @Override
    public void read() {
        System.out.println("selva is reading");
    }

    @Override
    public void write() {
        System.out.println("bindu is writing");
    }

    @Override
    public void type() {
        System.out.println("selbin is typing");
    }
}
public class IntEx {
    public static void main(String[] args) {
        Link l=new Link();
        l.read();
        l.type();
        l.write();
    }
}
