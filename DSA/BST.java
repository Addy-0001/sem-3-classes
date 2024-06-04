public class BST {
    // make the binary search tree such that the left child is always smaller than
    // the root node and the right child is larger than the root node.
    // [11, 6, 8,19,4,10,5,17,43,49,31]

    public static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    Node createBST(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (root.data > data) {
            root.left = createBST(root.left, data);
        } else if (root.data < data) {
            root.right = createBST(root.right, data);
        }
        return root;
    }

    Node get(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            get(root.left, data);
        } else if (data > root.data) {
            get(root.right, data);
        }
        return root;
    }

    int findMinVal(Node root) {
        int min = root.data;

        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    Node removeNode(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = removeNode(root.left, data);
        } else if (data > root.data) {
            root.right = removeNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                // Inorder traversal
                root.data = findMinVal(root);
                root.right = removeNode(root.right, root.data);
            }
        }
        return root;
    }

    int getParent(int i) {
        return (i - 1) / 2;
    }


    void inorder(Node root){
        if (root == null){
            return;
        } else {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    void createBinaryTree(int G[], int p, int data) {
        if (p < 0) {
            G[0] = data;
        } else if (p == getParent(data)) {
            G[2 * p + 1] = data;
        } else {
            
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Node root = bst.createBST(null, 11);
        root = bst.createBST(null, 6);
        root = bst.createBST(null, 8);
    }
}
