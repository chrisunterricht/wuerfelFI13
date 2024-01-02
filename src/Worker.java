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

    public static void paschdetektor(int wurf1, int wurf2){
        if (wurf1 == wurf2){
            System.out.println("Pasch!");
        } else {
            System.out.println("Kein Pasch!");
        }
    }

    public static void paschKurz(int wurf1, int wurf2){
        //ternary / ternärer Operator
        System.out.println(wurf1 == wurf2 ? "Pasch" : "Kein Pasch!");
    }

    public static boolean paschBool(int wurf1, int wurf2){
        return wurf1 == wurf2;
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
