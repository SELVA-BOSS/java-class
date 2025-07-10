package Day13;
interface Readable{
    void read();
}
interface Writable{
    void write();
}
interface Storable{
    void store();
}
class File implements Readable,Writable,Storable{
    @Override
    public void read() {
        System.out.println("reading");
    }

    @Override
    public void store() {
        System.out.println("storing");
    }

    @Override
    public void write() {
        System.out.println("writing");
    }
}
public class ExeforMultiple {
    public static void main(String[] args) {
        File f=new File();
        f.read();
        f.store();
        f.write();

    }
}
