import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        }
        if (number1 == number2) {
            System.out.println("Equals");
        } else {
            System.out.println(number2);
        }
    }
}