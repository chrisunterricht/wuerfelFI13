import java.util.Scanner;

public class Input {
    public static int getInt(String text){
        System.out.println(text);
        return getInt();
    }
    public static int getInt() {
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        try {
            return Integer.parseInt(temp);
        } catch (NumberFormatException errorMessage) {
            System.out.println("Error parsing " + temp);
            return getInt();
        }
    }
}
