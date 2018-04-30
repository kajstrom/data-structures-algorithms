package fi.kajstrom.datastructuresalgorithms.LinkedList;

import java.util.function.Function;

public class LinkedList<T> {
    private Node<T> first;

    public LinkedList(Node<T> first) {
        this.first = first;
    }

    public T read(int index) {
        Node<T> currentNode = first;
        int currentIndex = 0;

        while (currentIndex <= index) {
            if (currentIndex == index) {
                return currentNode.getData();
            }

            if (currentNode.hasNext()) {
                currentNode = currentNode.getNext();
                currentIndex++;
            } else {
                return null;
            }
        }

        return null;
    }

    public Integer indexOf(T value) {
        Node<T> currentNode = first;
        int currentIdx = 0;

        while (currentNode != null) {
            if (currentNode.getData().equals(value)) {
                return currentIdx;
            }

            currentNode = currentNode.getNext();
            currentIdx++;
        }

        return null;
    }

    public void insertAt(int index, Node<T> nodeToInsert) {
        int currentIndex = 0;
        Node<T> currentNode = first;

        while (currentIndex < index && currentNode != null) {
            if (currentIndex + 1 == index) {
                Node<T> currentNext = currentNode.getNext();
                nodeToInsert.setNext(currentNext);
                currentNode.setNext(nodeToInsert);
            }

            currentNode = currentNode.getNext();
            currentIndex++;
        }
    }

    public void deleteAt(int index) {
        int currentIndex = 0;

        if (index == 0) {
            first = first.getNext();
        }

        Node<T> currentNode = first;

        while(currentIndex < index && currentNode != null) {
            if ((index - 1) == currentIndex && currentNode.hasNext()) {
                Node<T> toDelete = currentNode.getNext();
                currentNode.setNext(toDelete.getNext());
                break;
            }

            currentNode = currentNode.getNext();
            currentIndex++;
        }
    }

    /**
     * Naive map implementation. It must return the same type as the original list.
     */
    public void map(Function<T, T> f) {
        Node<T> currentNode = first;

        while (currentNode != null) {
            currentNode.setData(f.apply(currentNode.getData()));

            currentNode = currentNode.getNext();
        }
    }
}
