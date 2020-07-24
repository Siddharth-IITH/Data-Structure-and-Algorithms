package LinkedList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {

    Node head;
    int length = 0;

    void deletelist() {
        head = null;
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        length++;
//            
    }

    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean search(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(7);

        System.out.println("start printing list: \n");
        ll.printlist();
        System.out.println("\nprinting end.\n");

        System.out.println("Length of LinkedList is: " + ll.length + "\n\n");

        int search_val = 1;

        System.out.println("Search for key=" + search_val + " in LinkedList is: " + String.valueOf(ll.search(ll.head, search_val)) + "\n\n");

    }

}
