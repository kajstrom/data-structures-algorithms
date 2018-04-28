package fi.kajstrom.datastructuresalgorithms.LinkedList;

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
            if (currentNode.equals(value)) {
                return currentIdx;
            }

            currentIdx++;
        }

        return null;
    }
}
