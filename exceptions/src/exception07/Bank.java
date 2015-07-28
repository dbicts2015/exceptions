package exception07;

public class Bank {
    private String naam;
    public Bank(String naam) throws BankException{
        if (Math.random()> 0.5) throw new BankException("Dit is een slecht moment om een bank te beginnen");
        this.naam = naam;
    }
    public String getNaam(){
        return naam;
    }
}
