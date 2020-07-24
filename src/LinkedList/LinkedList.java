package LinkedList;

class LinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    void deletelist() {
        head = null;
    }

    public void push(int new_data) {
        
        Node new_node= new Node(new_data);
        new_node.next=head;
        head=new_node;
//            
    }
    
    void printlist(){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        
        System.out.println("start printing list: \n");
        ll.printlist();
        System.out.println("\nprinting end.\n");
    }

}
