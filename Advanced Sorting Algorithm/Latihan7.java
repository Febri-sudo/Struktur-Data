import java.util.Scanner;
    public class Latihan7 {
        public static void main (String[] args) {
            int speed;

            Scanner in = new Scanner(System.in);

            speed = in.nextInt();

            if (speed < 10) {
                System.out.println("Slow");
            } else if (speed <= 50) {
                System.out.println("Avarage");
            } else if (speed <= 150) {
                System.out.println("fast");
            } else if (speed <=1000) {
                System.out.println("Ultra fast");
            }
            else {
                System.out.println("Extremely fast");
            }
        }
}
