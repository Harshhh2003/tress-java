
public class implementationtree {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static void display(node root) {
        if (root == null) return;
  if (root.left != null || root.right != null) {
            System.out.print(root.data + " -> ");
            if (root.left != null) System.out.print(root.left.data + " ");
            if (root.right != null) System.out.print(root.right.data);
            System.out.println();
        }

        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        node root = new node(10);
        node a = new node(5);
        node b = new node(15);
        root.left = a;
        root.right = b;
        node c = new node(3);
        node d = new node(10);
        a.left = c;
        a.right = d;
    

        display(root);
    }
}


