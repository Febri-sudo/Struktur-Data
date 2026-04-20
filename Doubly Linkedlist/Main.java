public class Main {
    public static void main(String[] args) {
        double_ll_non_circular list=new double_ll_non_circular();

        list.insertBefore(5);
        list.insertAfter(6);
        list.insertBefore(9);
        list.insertAfter(2);

        list.traverse();

        System.out.println(list.valueOf(5));
    }
}
