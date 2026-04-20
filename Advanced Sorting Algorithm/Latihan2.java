import java.util.Scanner;

//public class Latihan2 {
//    public static void main (String[] args) {
//
//        String name;
//        Scanner in = new Scanner(System.in);
//
//        name = in.nextLine();
//        System.out.printf("hi , %s", name);

    public class Latihan2 {
        public static void main (String[] args) {
            String name;
            int project;

            Scanner in = new Scanner(System.in);

            name = in.nextLine();
            project = in.nextInt();

            System.out.printf("The architect %s will need %s hours to complete %s project", name, project * 3, project);
}
    }


