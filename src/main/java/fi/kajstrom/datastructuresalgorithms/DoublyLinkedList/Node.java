package fi.kajstrom.datastructuresalgorithms.DoublyLinkedList;

public class Node<T> {
    private T value;
    private Node<T> prev;
    private Node<T> next;

    public Node (T value) {
        this.value = value;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}