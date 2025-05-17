public class minimumdepthtree {
 static class Node {
        int data;
        Node left, right;
  Node(int data) {
            this.data = data;
            left = right = null;
        } }
 public static int minDepth(Node root) {
        if (root == null)
            return 0;
   if (root.left == null)
            return 1 + minDepth(root.right);
   if (root.right == null)
            return 1 + minDepth(root.left);
  return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

  
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int minDepth = minDepth(root);
        System.out.println("MINI Depth of the tree is: " + minDepth);
    }
}
