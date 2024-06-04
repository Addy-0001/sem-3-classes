public class AVLTree {
    public static class Node {
        Node left;
        Node right;
        int height;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
            this.height = 1;
        }
    }

    int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    int getBalanceFactor(Node root) {
        if (root == null) {
            return 0;
        }
        return getHeight(root.left) - getHeight(root.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }

    Node leftRotation(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    public Node createBST(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {
            root.left = createBST(root.left, data);
        } else if (data > root.data) {
            root.right = createBST(root.right, data);
        }
        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        int balanceFactor = getBalanceFactor(root);
        if (balanceFactor > 1 && data < root.left.data) {
            // LL
            return rightRotate(root);
        } else if (balanceFactor > 1 && data > root.right.data) {
            // LR
            root.left = leftRotation(root.left); 
            return rightRotate(root);
        } else if (balanceFactor < -1 && data > root.left.data) {
            // RR
            leftRotation(root);
        } else if (balanceFactor < -1 && data < root.right.data) {
            // RL
            root.right = rightRotate(root.right); 
            return leftRotation(root); 
        }

        return root;
    }
}
