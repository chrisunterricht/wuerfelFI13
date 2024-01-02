public class Main
{
    public static void main(String[] args) {
        Wuerfel w = new Wuerfel();
        int anzahl6 = 0;
        int anzahlNicht6 = 0;
        for (int i = 1; i <= 100; i++){
            int erg = w.wurf();
            if (erg == 6){
                anzahl6++;
            } else {
                anzahlNicht6++;
            }
        }
        //System.out.println("Gewürfelte 6er: " + anzahl6);
        //System.out.println("Nicht 6er: " + anzahlNicht6);
        System.out.printf("Gewürfelte 6er: %d. %nNicht 6er: %d", anzahl6, anzahlNicht6);
    }
}
