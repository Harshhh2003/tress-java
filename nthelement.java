public class nthelement {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static void printlevel(node root, int n) {
        if (root == null) return;

        if (n == 1) {
            System.out.print(root.data + " ");
        } else {
            printlevel(root.left, n - 1);
            printlevel(root.right, n - 1);
        }
    }

    public static void main(String[] args) {
        node root = new node(10);
        node a = new node(20);
        node b = new node(15);
        root.left = a;
        root.right = b;

        node c = new node(15);
        node d = new node(111);
        a.left = c;
        a.right = d;

        node e = new node(100);
        c.left = e;

        int level = 2; 
        // level 1 = 10
        // level 3 = 15 and 111
        // level 4 = 100
        // level 5 = no o/p

        System.out.print("Nodes at level " + level + "-> ");
        printlevel(root, level);
    }
}
