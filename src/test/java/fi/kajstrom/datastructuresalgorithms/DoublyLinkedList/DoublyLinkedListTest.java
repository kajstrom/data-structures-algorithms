package fi.kajstrom.datastructuresalgorithms.DoublyLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    @Test
    void testInsertAtEnd_WhenCalledOnAnEmptyList_SetsTheSameNodeAsFirstAndLast() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertAtEnd(1);

        assertEquals(1, (int)list.getFirst());
        assertEquals(1, (int)list.getLast());
        assertEquals(1, list.length());
    }

    @Test
    void testInsertAtEnd_WhenCalledOnAnEmptyListTwice_SetsTheFirstAndLastNodesToDifferentValues() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertAtEnd(1);
        list.insertAtEnd(2);

        assertEquals(1, (int)list.getFirst());
        assertEquals(2, (int)list.getLast());
        assertEquals(2, list.length());
    }

    @Test
    void testLength_WhenCalledOnAnEmptyList_Returns0() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        assertEquals(0, list.length());
    }

    @Test
    void testRemoveFirst_WhenCalledOnANonEmptyList_ReturnsFirstNodeValueAndRemovesFirst() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        Integer first = list.removeFirst();

        assertEquals(1, first.intValue());
        assertEquals(2, list.length());
        assertEquals(2, (int)list.getFirst());
    }

    @Test
    void testRemoveFirst_WhenCalledOnAnEmptyList_ReturnsNull() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        assertNull(list.removeFirst());
    }

    @Test
    void testRemoveFirst_WhenCalledOnAListOfOneItems_ReturnsValueAndListIsEmptyAfterwards() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertAtEnd(10);

        Integer first = list.removeFirst();

        assertEquals(10, first.intValue());
        assertNull(list.getLast());
        assertNull(list.getFirst());
        assertEquals(0, list.length());
    }
}
