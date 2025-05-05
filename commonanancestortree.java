public class commonanancestortree {
    public static class node {
        int val;
        node left, right;
        node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    } public static boolean present(node root, node node) {
        if(root == null) return false; 
        if(root == node ) return true;
        return present(root.left, node) || present(root.right, node);
    }

    public static node lca(node root, node p, node q) {
        if(p == root || q == root) return root;  // p/q  me root node hoga ek
        if(p == q) return p; // wahi lca hoga single node
        boolean leftp = present(root.left, p);
        boolean rightq = present(root.right, q);

        if((leftp && rightq) || (!leftp && !rightq)) return root;
        if(leftp && !rightq) return lca(root.left, p, q);
        if(!leftp && rightq) return lca(root.right, p, q);

        return null;
    }

    public static void main(String[] args) {
        node root = new node(1);
    root.left = new node(2);
    root.right = new node(3);
    root.left.left = new node(4);
    root.left.right = new node(5);
    root.right.right = new node(6);

    node p = root.left.left;  // node 4 hai
    node q = root.left.right; // node 5 hai isme

    node ans = lca(root, p, q);
   System.out.println(  ans.val);
        
    }
}
