import java.util.Scanner;
public class Latihan11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("total angka ke %d");
        int n = in.nextInt();

        System.out.print("Masukan bilangan ke 1");
        int bilangan = in.nextInt();

        int perbandingan_terbesar;
        int perbandingan_terkecil;
        int bilangan_baru;
        perbandingan_terbesar = bilangan;
        perbandingan_terkecil = bilangan;

        for (int i = 2; i <= n; i++) {
            System.out.printf("Masukan bilangan ke %d", i);
            bilangan_baru = in.nextInt();
            if (bilangan_baru > perbandingan_terbesar) {
                perbandingan_terbesar = bilangan_baru;
            }
            if (bilangan_baru < perbandingan_terkecil) {
                perbandingan_terkecil = bilangan_baru;
            }
        }
        System.out.printf("Bilangan terbesar adalah %d", perbandingan_terbesar);

        System.out.printf("Bilangan terkecil adalah %d", perbandingan_terkecil);
    }
}