package exception08;

import java.util.Arrays;

public class TVZender {
    private static final int MAX_PROGRAMMAS = 10;
    private TVProgramma[] programmas=new TVProgramma[MAX_PROGRAMMAS];
    private int aantalProgrammas=0;
    public void addProgramma(TVProgramma programma) throws TVException{
        if (aantalProgrammas>= MAX_PROGRAMMAS) throw new TVAvondZitVolException("TV avond zit vol");
        if (isOverlap(programma)) throw new TVOverlapException("Programma overlapt");
        programmas[aantalProgrammas]= programma;
        aantalProgrammas++;
    }
    public boolean isOverlap(TVProgramma programma){
        boolean bOverlap=false;
        int index=0;
        while(index < aantalProgrammas && !bOverlap){
            if (programmas[index].overlapt(programma)) bOverlap=true;
            index++;
        }
        return bOverlap;
    }
    public String geefProgrammas(){
        Arrays.sort(programmas,0,aantalProgrammas);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<aantalProgrammas;i++){
            sb.append(programmas[i].toString());
            sb.append('\n');
        }
        return sb.toString();
    }
    
}
