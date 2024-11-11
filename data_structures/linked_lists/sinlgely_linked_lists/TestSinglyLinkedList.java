package data_structures.linked_lists.sinlgely_linked_lists;
public class TestSinglyLinkedList{
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();

        list.insertNode(5);
        list.insertNode(8);
        list.insertNode(9);
        list.insertNode(8);
        list.insertNode(0);
        list.insertNodeEnd(4);
        list.displayList();
    }
}