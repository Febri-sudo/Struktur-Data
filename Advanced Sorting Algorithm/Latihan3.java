import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dog= in.nextInt();
        int cat =  in.nextInt();

        double price;

        price = (dog * 2.50) + (cat * 4.0);

        System.out.print("Total = " + price);


    }
}
