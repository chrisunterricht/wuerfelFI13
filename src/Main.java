public class Main {
    public static void main(String[] args) {
        //Worker.augenProzent(200);
        /*for (int i = 0; i < 50; i++) {
            Wuerfel w = new Wuerfel();
            System.out.println(w.wurf(1,300));
        }*/
        Wuerfel w = new Wuerfel(1,20);
        Worker.augenProzent(w,20);
    }
}
