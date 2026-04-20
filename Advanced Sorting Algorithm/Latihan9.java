import java.util.Scanner;
public class Latihan9 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int number;

        number = in.nextInt();

        for (int i = 1; i <= number; i += 3) {
            System.out.println(i);
        }
    }
}
