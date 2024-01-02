public class Worker {
    private static final int[] augen = new int[6];
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

    public static void paschdetektor(int wurf1, int wurf2){
        if (wurf1 == wurf2){
            System.out.println("Pasch!");
        } else {
            System.out.println("Kein Pasch!");
        }
    }

    public static void augenzaehler(){
        Wuerfel w = new Wuerfel();
        for (int i = 1; i <= 100; i++){
            augen[w.wurf() -1]++;
        }
        int augenKey = 1;
        for (int auge : augen){
            System.out.println("Anzahl der Würfe einer " +augenKey+ ": " + auge);
        }
    }
    public static void paschKurz(int wurf1, int wurf2){
        //ternary / ternärer Operator
        System.out.println(wurf1 == wurf2 ? "Pasch" : "Kein Pasch!");
    }

    public static boolean paschBool(int wurf1, int wurf2){
        return wurf1 == wurf2;
    }

    public static void bisZumPaschUndDarueberHinaus(){
        Wuerfel w1 = new Wuerfel();
        Wuerfel w2 = new Wuerfel();
        int wuerfe = 0;
        int erfolglos = 0;
        boolean erg = false;
        while (wuerfe == 0) {

            do {
                erg = Worker.paschBool(w1.wurf(), w2.wurf());
                if (erg) wuerfe++;
            } while (erg);

            erfolglos++;
        }
        System.out.println("Nach " + erfolglos + " Versuchen gab es einen Pasch - und dann direkt " + wuerfe + " hintereinander.");
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
