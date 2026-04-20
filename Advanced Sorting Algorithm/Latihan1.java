import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        //System.out.println("hello world !");
        //System.out.print("helloworld 2 !!");
        //System.out.printf("i wanna say %s", "hello world 3");

//        int p;
//        int l;
//        int luas;
//
//        Scanner jack = new Scanner(System.in);
//
//        p = jack.nextInt();
//        l = jack.nextInt();
//
//        luas = p * l;
//
//        System.out.println("Luas = " + luas +  " Satuan kuadarat");
//        System.out.printf("Luas = %d satuan kuadrat", luas);

        double inchi;
        double cm;

        Scanner in = new Scanner(System.in);

        inchi = in.nextDouble();

        cm = inchi * 2.54;

        System.out.printf("%.2f inch equals to %.2f cm", inchi, cm);

    }
}
