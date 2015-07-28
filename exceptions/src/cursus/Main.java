package cursus;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws CursusOnbestaandeCursistException, CursusOnbestaandeCursusException  {
    	/* deel 1 */
        Cursist[] cursisten = new Cursist[3];
        int aantal = 0;
        for (int i = 0; i < 3; i++) {
            boolean inorde = false;
            do {
                String naam = JOptionPane.showInputDialog("Geef naam");
                String email = JOptionPane.showInputDialog("email");
                try {
                    Cursist c = new Cursist(naam, email);
                    cursisten[aantal] = c;
                    aantal++;
                    inorde = true;
                } catch (CursistVerkeerdeEmailException ce) {
                    JOptionPane.showMessageDialog(null, "email is verkeerd");
                }catch(CursistLegeNaamException ce){
                    JOptionPane.showMessageDialog(null, "naam mag niet leeg zijn");
                }
            } while (!inorde);
        }
        for(Cursist c: cursisten){
            System.out.println(c);
        }
        
        /* deel 3 */
        String[] cursussen={"inleiding","OBP","OOP"};
        Cursus cursus = new Cursus(cursisten, cursussen);
        cursus.voegPuntenToe(10, cursisten[0], cursussen[0]);
        cursus.voegPuntenToe(5, cursisten[0], cursussen[1]);
        cursus.voegPuntenToe(5, cursisten[0], cursussen[2]);
        cursus.voegPuntenToe(10, cursisten[1], cursussen[0]);
        cursus.voegPuntenToe(10, cursisten[1], cursussen[1]);
        cursus.voegPuntenToe(10, cursisten[1], cursussen[2]);
        double gemiddelde = cursus.geefGemiddelde(cursisten[0]);
        System.out.println("Gemiddelde voor "+cursisten[0].getNaam()+" is "+gemiddelde);
    }
}
