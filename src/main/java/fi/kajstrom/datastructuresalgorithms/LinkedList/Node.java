package fi.kajstrom.datastructuresalgorithms.LinkedList;

public class Node<T> {
    private T data;
    private Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }

    public void setNext(Node<T> node) {
        next = node;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public boolean hasNext() {
        return null != next;
    }
}
