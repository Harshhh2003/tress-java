public class implementation2 {
    public static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    } public static void main(String[] args) {
        node root = new node(10);

        root.left = new node(4);
        root.right = new node(10);
  root.left.left = new node(1);
        root.left.right = new node(5);
 root.right.left = new node(9);
        root.right.right = new node(12);
  System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
 System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
 System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);
    }
}
