package oeftijdstip;

public class Main {

    public static void main(String[] args) {
        Tijdstip t1= new Tijdstip(10,35);
        Tijdstip t2= new Tijdstip(11,00);
        Tijdstip t3= new Tijdstip(10,45);
        Tijdstip t4= new Tijdstip(11,35);
        Periode p1 = new Periode(t1, t2);
        Periode p2 = new Periode(t3, t4);
        Tijdsduur duur = p1.getDuurtijd();
        System.out.println(t2.toString());
        System.out.println("Duurtijd is " +duur);
        if (p1.overlapt(p2)){
            System.out.println("Beide periodes overlappen");
        }else{
            System.out.println("Beide periodes overlappen niet");
        }
    }

}
