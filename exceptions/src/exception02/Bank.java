package exception02;

public class Bank {
    private int saldo;
    private String naam;

    public int getSaldo() {
        return saldo;
    }

    public int setSaldo(int saldo) {
        if (saldo < 0) return -1;
        this.saldo = saldo;
        return 0;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
}
