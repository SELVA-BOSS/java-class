package Day14;
class Bank{
   private int cusno;
    private String bankname;
    //getter method

    public int getCusno() {
        return cusno;
    }

    public void setCusno(int cusno) {
        this.cusno = cusno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
}
public class EncEx {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setBankname("hdfc");
        b.setCusno(20);
        System.out.println(b.getBankname());
        System.out.println(b.getCusno());
    }
}
