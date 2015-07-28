package exception08;

public class TVProgramma implements Comparable<TVProgramma> {
    private String titel;
    private int beginuur;
    private int einduur;
    public TVProgramma(String titel, int beginuur, int einduur) throws TVException{
        setTitel(titel);
        setBeginEnEindUur(beginuur, einduur);
    }
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public int getBeginuur() {
        return beginuur;
    }
    public int getEinduur() {
        return einduur;
    }
    public void setBeginEnEindUur(int beginuur, int einduur) throws TVException{
        if (beginuur >= einduur) throw new TVBeginNaEindeException("beginuur moet voor einduur liggen");
        this.beginuur = beginuur;
        this.einduur= einduur;        
    }
    public boolean overlapt(TVProgramma anderProgramma){
        return this.beginuur < anderProgramma.einduur && this.einduur > anderProgramma.beginuur;
    }
    @Override
    public String toString(){
        return String.format("%1$s: %2$d - %3$d", titel,beginuur,einduur);
    }

    public int compareTo(TVProgramma o) {
        int resultaat=0;
        if (this.einduur<= o.beginuur) resultaat=-1;
        else if (o.einduur <= this.beginuur) resultaat=1;
        return resultaat;
    }
}
