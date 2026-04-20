public class Main_Circular {
    public static void main(){
        ListsCircular ll= new ListsCircular();

        ll.insertBefore(5);
        ll.insertBefore(4);
        ll.insertBefore(3);
        ll.insertBefore(2);
        ll.insertBefore(1);
        ll.insertAfter(6);
        ll.removeLast();

        ll.traverse();
    }
}
