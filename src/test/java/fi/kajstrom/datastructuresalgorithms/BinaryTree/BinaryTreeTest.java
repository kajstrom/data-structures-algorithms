package fi.kajstrom.datastructuresalgorithms.BinaryTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    void testSearch_WhenValueExistsInTree_ReturnsCorrectNode() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10);
        TreeNode root = new TreeNode(5, node1, node2);

        assertSame(node1, root.search(1));
        assertSame(node2, root.search(10));
        assertSame(root, root.search(5));
    }

    @Test
    void testSearch_WhenValueDoesNotExistInTree_ReturnsNull() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10);
        TreeNode root = new TreeNode(5, node1, node2);

        assertNull(root.search(12));
    }

    @Test
    void testInsert_WithLargerValue_InsertsValueAsRightChildOf10Node() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10);
        TreeNode root = new TreeNode(5, node1, node2);

        root.insert(12);

        assertEquals(node2.getRight().getValue(), 12);
    }

    @Test
    void testInsert_WithSmallerValue_InsertsValueAsLeftChild1Node() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10);
        TreeNode root = new TreeNode(5, node1, node2);

        root.insert(0);

        assertEquals(node1.getLeft().getValue(), 0);
    }

    @Test
    void testDelete_WithSimpleDeletionCase_DeletesValueFromTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10);
        TreeNode root = new TreeNode(5, node1, node2);

        root.delete(10);

        assertNull(root.search(10));
        assertNull(root.getRight());
    }

    @Test
    void testDelete_WithRightChildNode_DeletesValueFromTreeAndLiftsRightChild() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10, null, new TreeNode(11));
        TreeNode root = new TreeNode(5, node1, node2);

        root.delete(10);

        assertNull(root.search(10));
        assertEquals(11, root.getRight().getValue());
    }

    @Test
    void testDelete_WithLeftChildNode_DeletesValueFromTreeAndLiftsLeftChild() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10, new TreeNode(9), null);
        TreeNode root = new TreeNode(5, node1, node2);

        root.delete(10);

        assertNull(root.search(10));
        assertEquals(9, root.getRight().getValue());
    }

    @Test
    void testDelete_WithBothChildNodes_DeletesValueFromTreeAndLiftsRightChildWithLeftChildAsRightsLeftChild() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(10, new TreeNode(9), new TreeNode(11));
        TreeNode root = new TreeNode(5, node1, node2);

        root.delete(10);

        assertNull(root.search(10));
        assertEquals(11, root.getRight().getValue());
        assertEquals(9, root.getRight().getLeft().getValue());
    }
}
