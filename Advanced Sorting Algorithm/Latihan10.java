import java.util.Scanner;
public class Latihan10 {
    public static void main (String[] args){
        int n;
        int number;
        int total = 0;

        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Masukan angka ke %s =", i);
            number = in.nextInt();
            total =  total + number;
        }

        System.out.printf("Total number = %d", total);


    }
}
