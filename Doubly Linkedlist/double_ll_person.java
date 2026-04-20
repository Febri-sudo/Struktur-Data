public class double_ll_person {
    //attributes
    NodePerson head=null;

    //Method
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertBefore(String id,String nama,double gpa){
        NodePerson newNode = new NodePerson();
        newNode.value.id=id;
        newNode.value.name=nama;
        newNode.value.gpa=gpa;

        newNode.next=null;
        newNode.prev=null;

        if(isEmpty()){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void traverse(){
        if (isEmpty()){
            System.out.print("List Kosong!");
        }
        else{
            NodePerson help=head;
            System.out.print("null  <--");
            do{
                System.out.print(help.value.id+" "+help.value.name+" "+help.value.gpa+" <--> ");
                help=help.next;
            }while(help!=null);
            System.out.print("null");
        }
    }
    public void insertAfter(String id, String name, double gpa){
        NodePerson newNode = new NodePerson();
        newNode.value.id=id;
        newNode.value.name=name;
        newNode.value.gpa=gpa;

        newNode.next=null;
        newNode.prev=null;

        if (isEmpty()){
            head=newNode;
        }
        else{
            NodePerson help=head;
            while(help.next!=null){
                help=help.next;
            }

            help.next=newNode;
            newNode.prev=help;
        }
    }
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("List Is Empty!");
        }
        else{
            if(head.next!=null) {
                head = head.next;
                head.prev = null;
            }else{
                head=null;
            }
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("List is empty!");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            NodePerson help=head;
            while(help.next.next!=null){
                help=help.next;
            }
            help.next=null;
        }
    }
    public int indexOf(int val){
        if(isEmpty()){
            System.out.println("List Kosong!");
        }
        else{
            int pos=1;
            NodePerson help=head;
            boolean isFound=false;
            while(help!=null){
                if(help.value.gpa==val){
                    return pos;
                }
                else if(isFound==false && help.next!=null){
                    help=help.next;
                    pos++;
                }
                else{
                    break;
                }
            }
            if(!isFound){
                System.out.println("Value Not Found");
            }
        }
        return -1;
    }
    public double valueOf(int index) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return -1;
        } else {
            int jumlah = 1;
            NodePerson help = head;
            while (help.next != null) {
                jumlah++;
                help = help.next;
            }
            if (index > jumlah) {
                System.out.println("Index Out Of range!");
                return -1;
            }
            else{
                NodePerson help2=head;
                for(int i=1; i<index; i++){
                    help2=help2.next;
                }
                return help2.value.gpa;
            }
        }
    }
}
