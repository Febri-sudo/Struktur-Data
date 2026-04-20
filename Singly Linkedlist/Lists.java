public class Lists {

    //Attributes
    Node head=null;

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
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfter(int nilai) {
        Node newNode = new Node();
        newNode.value = nilai;
        newNode.next = null;

        if (isEmpty()){
            head=newNode;
        }
        else{
            Node help=head;
            while(help.next!=null){
                help=help.next;
            }
            help.next=newNode;
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
            }while(help!=null);
            System.out.println("null");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Empty!");
        }
        else{
            System.out.printf("%d is REMOVED! \n", head.value);
            head=head.next;
        }
    }

    public void removeLast() {
        if(isEmpty()){
            System.out.println("Error!");
        }
        else if(head.next==null){
            head=null;
            System.out.printf("%d Is Being Removed",head.value);
        }
        else{
            Node help=head;
            while (help.next.next != null) {
                help = help.next;
            }
            System.out.printf("%d Is Being Removed\n", help.next.value);
            help.next = null;
        }
    }
    public void insertAt(int pos, int nilai) {
        if(pos<1 || pos==1){
            Node newNode = new Node();
            newNode.value = nilai;
            newNode.next = head;
            head = newNode;
        }
        else{
            Node help=head;
            for(int i=1; i<pos-1 && help.next!=null; i++){
                help=help.next;
            }

            Node newNode=new Node();
            newNode.value=nilai;
            newNode.next=help.next;
            help.next=newNode;
        }
    }
    public int indexOf(int value){
        if(head.value==value){
            System.out.printf("Nilai %d, ditemukan di posisi ke-1\n",value);
        }
        else{
            Node help=head;
            int pos=1;
            boolean isFound = false;
            while (!isFound){
                help = help.next;
                pos++;
                if (help.value == value) {
                    isFound = true;
                }
            }
            System.out.printf("Nilai %d, ditemukan di posisi ke-%d\n",value, pos);
        }return -1;
    }
    public void valueOf(int pos){
        Node help=head;
        for(int i=1; i<pos; i++){
            help=help.next;
        }
        System.out.printf("Diposisi ke-%d, ditemukan nilai: %d\n",pos, help.value);
    }
    public void reverse(){

    }
    public int index0f(int value) {
        if (isEmpty()) {
            System.out.println(" err: empty !");
        } else {
            Node helper = head;
            int counter = 1;
            boolean found = false;

            do{
                if (value == helper.value){
                    found = true;
                    return counter;
                } else {
                    counter++;
                    helper = helper.next;
                }
            }while (!found && helper != null);
        }
        return -1;
    }

    public int value0f(int index){
        if (isEmpty()) {
            System.out.println(" err: empty !");
            return-1;
        }else{
            Node helper = head;
            int counter = 1;
            do {
                helper = helper.next;
                if (helper != null){
                    counter++;
                }
            }while (helper != null);

            if (index <= counter) {
                helper = head;
                for (int i = 1; i <= index; i++){
                    helper = helper.next;
                }
                return helper.value;
            }else{
                System.out.println(" err: empty !");
                return -1;
            }
        }
    }
    public void insertat(int val, int pos){
        //if (pos < 1) return;
        if (isEmpty()){
            insertAfter(val);
        } else
        if (pos <= 1) {
            insertBefore(val);
        } else {
            Node helper = head;
            int size = 1;
            do {
                helper = helper.next;
                if (helper != null){
                    size++;
                }
            } while (helper != null);
            if (pos > size){
                insertAfter(val);
            } else {
                Node helper2 = head;

                Node newNode = new Node();
                newNode.value = val;
                for (int i = 0; i < pos - 1; i++) {
                    helper2 = helper.next;
                }
                newNode.next = helper2.next;
                helper2.next = newNode;
            }
        }
    }
}

