package Day03;

public class LogicalEx {
    public static void main(String[] args) {
        // and , or
        boolean re= 100>80 && 400>300;//both condition are correct so true
        System.out.println(re);
        boolean resu=100>800 || 200>500;
        System.out.println(resu);

        boolean res= 150>120 && 200>230;//one correct is correct and one is wrong so false
        System.out.println(res);
    }
}
