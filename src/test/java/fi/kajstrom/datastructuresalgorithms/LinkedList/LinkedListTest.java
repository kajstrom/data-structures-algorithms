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

    @Test
    void testIndexOf_WithExistingValue_ReturnsCorrectValue() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        assertEquals(0, (int)list.indexOf(10));
        assertEquals(1, (int)list.indexOf(20));
        assertEquals(2, (int)list.indexOf(30));
    }

    @Test
    void testIndexOf_WithNonExistingValue_ReturnsNull() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        assertNull(list.indexOf(40));
        assertNull(list.indexOf(9));
    }

    @Test
    void testInsertAt_WithValidIndex_AddsElement() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.insertAt(1, new Node<Integer>(15));

        assertEquals(10, (int)list.read(0));
        assertEquals(15, (int)list.read(1));
        assertEquals(20, (int)list.read(2));
        assertEquals(30, (int)list.read(3));
    }

    @Test
    void testInsertAt_WithInvalidIndex_DoesNotAddElement() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.insertAt(5, new Node<Integer>(40));

        assertEquals(10, (int)list.read(0));
        assertEquals(20, (int)list.read(1));
        assertEquals(30, (int)list.read(2));
        assertNull(list.read(3));
    }

    @Test
    void testDeleteAt_WithValidIndex_DeletesElement() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.deleteAt(1);

        assertEquals(10, (int)list.read(0));
        assertEquals(30, (int)list.read(1));
    }

    @Test
    void testDeleteAt_WithFirstIndex_DeletesElement() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.deleteAt(0);

        assertEquals(20, (int)list.read(0));
        assertEquals(30, (int)list.read(1));
    }

    @Test
    void testDeleteAt_WithLastIndex_DeletesElement() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.deleteAt(2);

        assertEquals(10, (int)list.read(0));
        assertEquals(20, (int)list.read(1));
        assertNull(list.read(2));
    }

    @Test
    void testDeleteAt_WithInvalidIndex_DoesNotDeleteElements() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.deleteAt(3);

        assertEquals(10, (int)list.read(0));
        assertEquals(20, (int)list.read(1));
        assertEquals(30, (int)list.read(2));
    }

    @Test
    void testMap_WithTimesTwoFunction_AltersListContent() {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.setNext(node2);
        node2.setNext(node3);

        LinkedList<Integer> list = new LinkedList<>(node1);

        list.map((v) -> v * 2);

        assertEquals(20, (int)list.read(0));
        assertEquals(40, (int)list.read(1));
        assertEquals(60, (int)list.read(2));
    }
}
