public class Wuerfel {

    private int max;
    private int min;

    public Wuerfel(int min, int max) {
        this.max = max;
        this.min = min;
    }

    public Wuerfel(){
        this.max = 6;
        this.min = 1;
    }

    public int getMin() {
        return min;
    }

    public int wurf() {
           return this.wurf(this.min, this.max);
    }

    public int wurf(int max) {
        return this.wurf(1, max);
    }

    public int wurf(int min, int max) {
        if (max < min) {
            throw new IllegalArgumentException("Max < Min!");
        }
        this.max = max;
        this.min = min;
        return (int)(Math.random() * max) + min;
    }

    public int getCount() {
        return this.max + 1 - this.min;
    }
}
