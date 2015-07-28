package exception09;

public class Radio {
    public static final double MINIMUM_FREKWENTIE=88.0;
    public static final double MAXIMUM_FREWKENTIE=108.0;
    private double[] frekwenties={94.2, 97.5,96.4,100.9,89.0};
    private String[] zenders={"Radio 1","Radio 2", "Klara", "Studio Brussel","Radio Donna"};
    private String[] muziek={"Jan De Wilde","Willy Sommers","Peter Benoit","Sisters of Mercy","Michael Jackson"};
    private double frekwentie;

    public double getFrekwentie() {
        return frekwentie;
    }

    public void setFrekwentie(double frekwentie) {
        if (frekwentie < MINIMUM_FREKWENTIE || frekwentie > MAXIMUM_FREWKENTIE){
            String errormessage = String.format("Frekwentie moet tussen %1$5.2f MHz en %2$5.2f MHz liggen", MINIMUM_FREKWENTIE,MAXIMUM_FREWKENTIE);
            throw new IllegalArgumentException(errormessage);
        }
        this.frekwentie = frekwentie;
    }
    public String speelRadio(){
         String resultaat="Hier is geen muziek";
         for (int i=0;i<frekwenties.length;i++){
             if (isGelijk(frekwenties[i],frekwentie)){
                 resultaat= String.format("Dit is %1$s en wij spelen muziek van %2$s",zenders[i],muziek[i]);
                 break;
             }
         }
         return resultaat;
    }
    private boolean isGelijk(double frekwentie1, double frekwentie2){
        return Math.abs(frekwentie1-frekwentie2) < 0.15;
    }
}
