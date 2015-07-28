package exception08;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        TVZender zender = new TVZender();
        for (int i = 0; i < 5; i++) {
            boolean inputinorde = false;
            do {

                String titel = JOptionPane.showInputDialog("Geef titel");
                int beginuur = Integer.parseInt(JOptionPane.showInputDialog("Geef beginuur"));
                int einduur = Integer.parseInt(JOptionPane.showInputDialog("Geef einduur"));
                try {
                    TVProgramma p = new TVProgramma(titel, beginuur, einduur);
                    inputinorde = true;
                    zender.addProgramma(p);
                } catch (TVBeginNaEindeException te) {
                    inputinorde = false;
                    JOptionPane.showMessageDialog(null, "Begin uur komt na einduur. Opnieuw");
                } catch (TVException te) {
                    System.out.println(te.getMessage());
                }

            } while (!inputinorde);
        }
        String programmas = zender.geefProgrammas();
        System.out.println(programmas);

    }
}
