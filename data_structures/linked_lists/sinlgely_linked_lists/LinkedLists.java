package data_structures.linked_lists.sinlgely_linked_lists;
public class LinkedLists {
    private Node head;
    /**
     * inserNode- Adds a new node to the linked lists.
     * @param data
     */
    public void insertNode(int data){
        Node new_node = new Node();
        new_node.data = data;
        Node next_node;

        if(head == null){
            head = new_node;
        }else{
            next_node = head;
            while(next_node.next != null){
                next_node = next_node.next;
            }
            next_node.next = new_node;
        }
    }

    /**
     * insertNodeEnd - Adds a new node to the end of the lists.
     * @param data
     */
    public void insertNodeEnd(int data){
        Node new_node = new Node();
        new_node.data = data;
        Node next_node;
        next_node = head;
        if(head == null){
            head = new_node;
        }else{
            while(next_node.next != null){
                next_node = next_node.next;
            }
            next_node.next = new_node;
        }

    }

    /**
     * displayList - display all the values in the list.
     */
    public void displayList(){
        Node next_node = head;

        while(next_node != null){
            System.out.println(next_node.data);
            next_node = next_node.next;
        }
    }
}