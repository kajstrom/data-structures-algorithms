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
}
