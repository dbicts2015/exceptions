package exception06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.print("Geef je naam: ");
        try{
            String naam = leesTekst();
            System.out.println("Dag "+naam);
        }catch(IOException ioe){
            System.out.println("IO fout opgetreden");
        }
    }
    public static String leesTekst() throws IOException{
        BufferedReader lezer= new BufferedReader(new InputStreamReader(System.in));
        return lezer.readLine();
    }
}
