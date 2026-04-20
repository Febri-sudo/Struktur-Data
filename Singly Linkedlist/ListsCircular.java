import javax.swing.*;

public class ListsCircular {

    //Attributes
    Node head=null;
    Node tail=null;

    //Method
    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void insertBefore(int nilai) {
        Node newNode = new Node();
        newNode.value = nilai;
        newNode.next = null;

        if (isEmpty()){
            head = tail = newNode;
            newNode.next=head;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next=head;
        }
    }

    public void insertAfter(int nilai) {
        Node newNode = new Node();
        newNode.value = nilai;
        newNode.next = null;

        if (isEmpty()){
            head=tail=newNode;
            newNode.next=head;
        }
        else{
            Node help=head;
            do {
                help=help.next;
            }while(help!=tail);
            help.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("List Kosong!");
        }
        else{
            Node help=new Node();
            help=head;

            do{
                System.out.print(help.value+" --> ");
                help=help.next;
            }while(help!=head);
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty!");
        }
        else if (head==tail) {
            head=tail=null;
        }
        else {
            System.out.printf("%d is REMOVED! \n", head.value);
            head=head.next;
            tail.next=head;
        }
    }

    public void removeLast() {
        if(isEmpty()){
            System.out.println("Error!");
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            Node help=head;
            while(help.next!=tail){
                help=help.next;
            }
            tail=help;
            help.next=null;
            tail.next=head;
        }
    }
    public void insertAt(int pos, int nilai) {
        Node Count = head;
        int N = 1;
        while (Count != null) {
            Count = Count.next;
            N++;
        }
        if(pos<1 || pos==1 || isEmpty()){
            Node newNode = new Node();
            newNode.value = nilai;
            newNode.next = head;
            head = newNode;
        }
        else if(pos>N) {
            insertAfter(nilai);
        }
        else {
            Node help = head;
            for (int i = 1; i < pos - 2 && help.next != null; i++) {
                help = help.next;
            }

            Node newNode = new Node();
            newNode.value = nilai;
            newNode.next = help.next;
            help.next = newNode;
        }
    }
    public int indexOf(int value){
        if(isEmpty()){
            System.out.println("Error@");
            return -1;
        }
        else{
            Node help=head;
            int pos=1;
            boolean isFound = false;
            while (!isFound && help!=null){
                if (help.value == value) {
                    isFound = true;
                    return pos;
                }
                else{
                    help = help.next;
                    pos++;
                }
            }
        }
        return -1;
    }
    public int valueOf(int pos) {
        Node help = head;
        if (isEmpty()) {
            System.out.println("Error!");
            return -1;
        } else {
            Node Count = head;
            int N = 1;
            while (Count != null) {
                Count = Count.next;
                N++;
            }
            if (pos > N) {
                System.out.println("Error!");
                return -1;
            } else {
                for (int i = 1; i < pos; i++) {
                    help = help.next;
                }
            }
        }
        return help.value;
    }
    public void reverse(){

    }
}
