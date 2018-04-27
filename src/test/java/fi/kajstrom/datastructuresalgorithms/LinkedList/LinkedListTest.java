package fi.kajstrom.datastructuresalgorithms.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    void testRead_WithExistingIndex_ReturnsCorrectValue() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        assertEquals((Integer)10, list.read(0));
        assertEquals((Integer)20, list.read(1));
        assertEquals((Integer)30, list.read(2));
    }

    @Test
    void testRead_WithNonExistingIndex_ReturnsNull() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        assertNull(list.read(5));
        assertNull(list.read(4));
        assertNull(list.read(-1));

    }
}
