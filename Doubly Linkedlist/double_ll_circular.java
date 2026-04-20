public class double_ll_circular {

    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertBefore(int param) {
        Node node = new Node();
        node.value = param;

        if (isEmpty()) {
            head = node;
            head.next = head; // Menunjuk ke diri sendiri
            head.prev = head; // Menunjuk ke diri sendiri
        } else {
            Node tail = head.prev; // Node terakhir

            node.next = head;
            node.prev = tail;

            head.prev = node;
            tail.next = node;

            head = node; // Pindahkan head ke node baru
        }
        System.out.println("1 node has been inserted at the front!");
    }

    public void insertAfter(int param) {
        Node node = new Node();
        node.value = param;

        if (isEmpty()) {
            head = node;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = node;
            node.prev = tail;
            node.next = head;
            head.prev = node;
        }
        System.out.printf("1 node inserted at the end! %n");
    }

    public void traverse() {
        if (!isEmpty()) {
            Node helper = head;
            do {
                System.out.printf(" %d <--> ", helper.value);
                helper = helper.next;
            } while (helper != head); // Berhenti jika kembali ke head

            System.out.println(" (back to head: " + head.value + ")");
        } else {
            System.out.println("err: empty list !");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (head.next == head) { // Jika hanya ada 1 node
                head = null;
            } else {
                Node tail = head.prev;
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
        } else {
            System.out.println("err: empty list !");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (head.next == head) {
                head = null;
            } else {
                Node tail = head.prev;
                Node newTail = tail.prev;

                newTail.next = head;
                head.prev = newTail;
            }
        } else {
            System.out.println("err : empty list !");
        }
    }

    public int size() {
        if (isEmpty()) return 0;
        int counter = 0;
        Node helper = head;
        do {
            counter++;
            helper = helper.next;
        } while (helper != head);
        return counter;
    }

    public int valueOf(int index) {
        if (index > 0 && index <= size()) {
            Node helper = head;
            for (int i = 1; i < index; i++) {
                helper = helper.next;
            }
            return helper.value;
        } else {
            System.out.println("err : data is not available !");
            return -1;
        }
    }

    public int indexOf(int param) {
        if (!isEmpty()) {
            Node helper = head;
            int index = 1;
            do {
                if (helper.value == param) {
                    System.out.println("Found at index " + index);
                    return index;
                }
                helper = helper.next;
                index++;
            } while (helper != head);
            System.out.println("err: data is not available !");
        }
        return -1;
    }
}
