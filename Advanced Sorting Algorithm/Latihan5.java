import java.util.Scanner;
    public class Latihan5 {
        public static void main(String[] args){

            int number;
            Scanner in = new Scanner(System.in);

            number = in.nextInt();

            if(number % 2 == 0)
            {
                System.out.println("Even");
            }
            else{
                System.out.println("ODD");
            }

    }
}
