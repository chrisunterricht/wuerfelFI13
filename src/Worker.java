public class Worker {
    public static void howMany(){
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
        System.out.printf("Gewürfelte 6er: %d. %nNicht 6er: %d", anzahl6, anzahlNicht6);
    }

    public void howManyNonStatic(){
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
        System.out.printf("Gewürfelte 6er: %d. %nNicht 6er: %d", anzahl6, anzahlNicht6);
    }
}
