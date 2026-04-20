public class main_person_circular {
    public static void main(String[] args) {
       double_ll_circular_person ll = new double_ll_circular_person();

        ll.insertBefore("12154", "huhu", "4.00");
        ll.insertBefore("1234", "dodo", "3.5");
        ll.insertAfter("1234", "mamat", "2.8");
        ll.insertAfter("3344", "klee", "1.8");
        ll.traverse();
        System.out.println(ll.valueOf(1));
    }
}
