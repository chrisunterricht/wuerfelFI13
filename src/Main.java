public class Main
{
    public static void main(String[] args) {
        //Worker w = new Worker();
        //w.howManyNonStatic();
        //Worker.howMany();
        Wuerfel w1 = new Wuerfel();
        Wuerfel w2 = new Wuerfel();
        //Worker.paschKurz(w1.wurf(), w2.wurf());
        int wuerfe = 1;
        boolean erg = false;
        while (wuerfe == 1) {
            do {
                erg = Worker.paschBool(w1.wurf(), w2.wurf());
                if (erg) wuerfe++;
            } while (erg);
        }
        System.out.println(wuerfe);
    }
}
