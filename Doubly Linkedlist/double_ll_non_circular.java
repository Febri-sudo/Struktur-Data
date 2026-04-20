public class double_ll_non_circular {

    Node head = null;

    public boolean isEmpty() {
        if (head == null){
            return true;
        } else{
            return false;
        }
        // return head == null ? true : false;
    }

    public void insertBefore(int param) {
        Node node = new Node();
        node.value = param;
        node.next = null;
        node.prev = null;
        if (isEmpty()){
            head = node;
        }else {
            node .next = head;
            head.prev = node;

            head = node;
        }
        System.out.println("1 node has been inserted !");
    }

    public void traverse(){
        if (!isEmpty()){
            Node helper = head;

            do{
                System.out.printf(" %d <--> " , helper.value);
                helper = helper.next;
            }while (helper != null);

            System.out.println(" null");
        }
        else {
            System.out.printf("err: empty list !");
        }
    }
    public void insertAfter(int param) {
        Node node = new Node();
        node.value = param;
        node.next = null;
        node.prev = null;

        if (isEmpty()) {
            ;
            head = node;
        } else {
            //find the tail node
            Node helper = head;

            while (helper.next != null) {
                helper = helper.next;
            }

            helper.next = node;
            node.prev = helper;
        }
        System.out.printf("1 node inserted ! %n");
    }
    public void removeFirst() {
        if (!isEmpty()) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                System.out.println("err: empty list !");
            }
        }
    }
    public void removeLast() {
        if (!isEmpty()) {
            if (head.next == null){
                head = null;
            }else{
                Node helper = head;

                while (helper.next.next != null){
                    helper = helper.next;
                }

                helper.next = null;
            }
        }else{
            System.out.println("err : empty list !");
        }
    }
    public int size(){
        int counter = 0;

        if (!isEmpty()) {
            Node helper = head;

            do {
                helper = helper .next;
                counter = counter + 1;
            } while(helper != null);

        }
        return counter;
    }

    public int valueOf(int index) {
        if (index <= size()) {
            Node helper = head;
            for (int i = 1; i < index; i++){
                helper = helper.next;
            }
            return helper.value;
        }else {
            System.out.println("err : data is not available !");
        }
        return -1;
    }

    public int indexOf(int param) {
        if (!isEmpty()){

            Node helper = head;
            int index = 1;
            boolean isFound = false;

            do {
                if (helper.value == param) {
                    isFound = true;
                    System.out.println("Found at index" + index);
                    return index;
                }
                helper = helper.next;
                index++;

            }while (helper != null);

            if(!isFound) {
                System.out.println("err: data is not available !");
                return -1;
            } else {
                System.out.println("err :empty list");
            }
        }return -1;
    }
}

