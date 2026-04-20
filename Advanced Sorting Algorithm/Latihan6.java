import java.util.Scanner;
    public class Latihan6 {
        public static void main(String[] args) {
            int number;

            Scanner in = new Scanner(System.in);

            number = in.nextInt();

            if (number < 100) {
                System.out.println("Less then 100");

            } else if (number < 200) {
                System.out.println("Less then 200");
            }
            else{
                System.out.println("More or less then 200");
            }
        }
    }