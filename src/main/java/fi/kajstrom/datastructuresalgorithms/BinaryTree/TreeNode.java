package fi.kajstrom.datastructuresalgorithms.BinaryTree;

public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

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

    public void insert(int valueToInsert) {
        if (value < valueToInsert) {
            if (right == null) {
                right = new TreeNode(valueToInsert);
            } else {
                right.insert(valueToInsert);
            }
        } else if (value > valueToInsert) {
            if (left == null) {
                left = new TreeNode(valueToInsert);
            } else {
                left.insert(valueToInsert);
            }
        }
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public int getValue() {
        return value;
    }
}
