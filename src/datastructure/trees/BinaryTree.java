package datastructure.trees;

class TreeNode {
    String value;
    TreeNode left, right;

    TreeNode(String item) {
        value = item;
        left = right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    // Class to store the result
    static class Result {
        int cumulativeLength = 0;
        Character foundCharacter = null;
    }

    // Method to find the character at a given index
    public Character findLetterByIndex(TreeNode node, int index) {
        Result result = new Result();
        inOrderTraversal(node, index, result);
        return result.foundCharacter;
    }

    // Helper method for in-order traversal
    private void inOrderTraversal(TreeNode node, int index, Result result) {
        if (node == null || result.foundCharacter != null) {
            return;
        }

        // Traverse left subtree
        inOrderTraversal(node.left, index, result);

        // Visit current node
        for (char c : node.value.toCharArray()) {
            if (result.cumulativeLength == index) {
                result.foundCharacter = c;
                return;
            }
            result.cumulativeLength++;
        }

        // Traverse right subtree
        inOrderTraversal(node.right, index, result);
    }

    // Driver method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode("apple");
        tree.root.left = new TreeNode("banana");
        tree.root.right = new TreeNode("cherry");
        tree.root.left.left = new TreeNode("date");
        tree.root.left.right = new TreeNode("fig");
        tree.root.right.right = new TreeNode("grape");

        int index = 10; // Example index
        Character result = tree.findLetterByIndex(tree.root, index);

        if (result != null) {
            System.out.println("Character at index " + index + ": " + result);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}