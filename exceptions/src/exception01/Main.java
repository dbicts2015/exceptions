package exception01;

import javax.swing.JOptionPane;

public class Main {

    private static final int OK = 0;
    private static final int BANK_NIET_GEVONDEN = -1;
    private static final int SALDO_NIET_VOLDOENDE = -2;
    private static final int BEDRAG_NEGATIEF = -3;

    public static void main(String[] args) {
        String bank = JOptionPane.showInputDialog("Geef bank");
        int bedrag = Integer.parseInt(JOptionPane.showInputDialog("Geef bedrag"));
        int error = schrijfOver(bank, bedrag);
        switch (error) {
            case OK:
                System.out.println("Overschrijving gelukt");
                break;
            case BANK_NIET_GEVONDEN:
                System.out.println("Bank bestaat niet");
                break;
            case SALDO_NIET_VOLDOENDE:
                System.out.println("Saldo is niet voldoende");
                break;
            case BEDRAG_NEGATIEF:
                System.out.println("U kan geen negatief bedrag overschrijven");
                break;

        }
    }

    public static int schrijfOver(String naam, int bedrag) {
        if (bedrag < 0) {
            return BEDRAG_NEGATIEF;
        }
        int error = boekBedrag(naam, bedrag);
        return error;
    }

    public static int boekBedrag(String naam, int bedrag) {
        String[] banken = {"Fortis", "Dexia", "Kaupthing"};
        int[] saldo = {100, 70, 5};
        int index = geefIndex(banken, naam);
        if (index == -1) {
            return BANK_NIET_GEVONDEN;
        }
        if (saldo[index] < bedrag) {
            return SALDO_NIET_VOLDOENDE;
        }
        saldo[index] = saldo[index] - bedrag;
        return OK;
    }

    public static int geefIndex(String[] banken, String banknaam) {
        int index = 0;
        boolean gevonden = false;
        while (index < banken.length && !gevonden) {
            if (banken[index].equals(banknaam)) {
                gevonden = true;
            } else {
                index++;
            }
        }
        if (!gevonden) {
            index = -1;
        }
        return index;
    }
}
