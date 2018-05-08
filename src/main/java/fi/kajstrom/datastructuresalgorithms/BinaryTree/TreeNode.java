package fi.kajstrom.datastructuresalgorithms.BinaryTree;

public class TreeNode {
    private final int value;
    private final TreeNode left;
    private final TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode search(int value) {
        if (this.value == value) {
            return this;
        }

        if (value < this.value && left != null) {
            return left.search(value);
        }

        if (value > this.value && right != null) {
            return right.search(value);
        }

        return null;
    }
}
