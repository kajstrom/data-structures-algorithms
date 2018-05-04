package fi.kajstrom.datastructuresalgorithms.DoublyLinkedList;

public class DoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public void insertAtEnd(T value) {
        Node<T> insert = new Node<>(value);

        if (first == null) {
            first = insert;
            last = first;
        } else {
            insert.setPrev(last);
            last.setNext(insert);
            last = insert;
        }
    }

    public T getFirst() {
        return first.getValue();
    }

    public T getLast() {
        return last.getValue();
    }

    public int length() {
        if (first == null) {
            return 0;
        }

        Node<T> current = first;
        int length = 0;
        while(current != null) {
            current = current.getNext();
            length++;
        }

        return length;
    }
}
