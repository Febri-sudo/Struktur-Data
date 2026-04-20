public class double_ll_circular_person {
    Node_Person_Circular head = null;
    Node_Person_Circular tail = null;

    public boolean isEmpty() {
        //if (head == null) return true;
        //else return false;
        return head == null ? true : false;
    }

    public void insertBefore(String id, String name, String gpa) {
        Node_Person_Circular newNode = new Node_Person_Circular();
        newNode.value.id = id;
        newNode.value.name = name;
        newNode.value.gpa = gpa;
        newNode.next = null;
        newNode.prev = null;
        if (isEmpty()) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.value.id = id;
            newNode.value.name = name;
            newNode.value.gpa = gpa;
            newNode.next = null;
            newNode.prev = null;

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head;
        }
        System.out.println("1 Node has been inserted!");
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Error!");
        } else {
            Node_Person_Circular helper = head;
            do {
                System.out.print(helper.value.id + " " + helper.value.name + " " + helper.value.gpa + " <--> ");
                helper = helper.next;
                if (helper.next == null){
                    break;
                } else if (helper.prev == null) {
                    break;
                }
            } while (helper != head);
            System.out.println("Null");
        }
    }

    public void insertAfter(String id, String name, String gpa) {
        Node_Person_Circular newNode = new Node_Person_Circular();
        newNode.value.id = id;
        newNode.value.name = name;
        newNode.value.gpa = gpa;
        newNode.next = null;
        newNode.prev = null;
        if (isEmpty()) {
            head = tail = newNode;
            tail.next = head;
        } else {
            Node_Person_Circular helper = head;
            while (helper.next != head) {
                helper = helper.next;
            }
            helper.next = newNode;
            newNode.prev = helper;
            tail = newNode;
            tail.next = head;
        }
        System.out.println("1 Node has been inserted!");
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Error!");
        } else if (head.next == null) {
            System.out.println("1 Node is being removed!");
            head = null;
        } else {
            head = head.next;
            head.prev = null;
            System.out.println("1 Node has been removed!");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Error!");
        } else if (head == tail) {
            System.out.println("1 Node is being removed!");
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next.next = null;
            System.out.println("1 Node has been removed!");
        }
    }

    public int indexOf(String val){
        if(isEmpty()){
            System.out.println("List Kosong!");
        }
        else{
            int pos = 1;
            Node_Person_Circular helper = head;
            while (true){
                if (helper.value.name.equals(val)){
                    return pos;
                }
                else if (helper.next != head){
                    helper = helper.next;
                    pos++;
                }
                else{
                    break;
                }
            }
            System.out.println("Value Not Found");
            }
        return -1;
        }

    public String valueOf(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return "erorr";
        } else {
            int jumlah = 1;
            Node_Person_Circular helper = head;
            while (helper.next != head) {
                jumlah++;
                helper = helper.next;
            }
            if (index > jumlah) {
                System.out.println("Index Out Of range!");
                return "erorr";
            } else {
                Node_Person_Circular helper2 = head;
                for (int i = 1; i < index; i++) {
                    helper2 = helper2.next;
                }
                return "name " + helper2.value.name + " id " + helper2.value.id + " gpa " + helper2.value.gpa;
            }
        }
    }
}
