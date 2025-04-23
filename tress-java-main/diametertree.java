class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}public class diametertree {

    static int max = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return max;
    }
 public static int findHeight(TreeNode node) {
        if (node == null) return 0;

        int left = findHeight(node.left);
        int right = findHeight(node.right);

        max = Math.max(max, left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter: " + diameterOfBinaryTree(root));
    }

}