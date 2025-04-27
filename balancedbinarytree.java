public class balancedbinarytree{
    public static class node{
        int data;
         node left , right;
         node(int data){
            this.data = data;

         }
    } public static int heighttree( node root){
        if(root == null) return 0;
        int leftside = heighttree(root.left);
        int rightside = heighttree(root.right) ;
        return Math.max(leftside, rightside) +1;

    } public static boolean isbalancedtree(node root){
        if( root == null) return true;
        int leftside = heighttree(root.left);
        int rightside  = heighttree(root.right);
         if(leftside - rightside > 1  ||   rightside - leftside>1){
            return false;
         }
         return isbalancedtree(root.left) && isbalancedtree(root.right);

    }
    public static void main(String[] args) {
        node root = new node(1);
root.left = new node(2);
root.right = new node(3);
root.left.left = new node(4);
root.left.right = new node(5);
root.left.left.left = new node(6);
if(isbalancedtree(root)){
    System.out.println("tree is blanced");
} else{
    System.out.println("unbalanced tree");
}

        
    }
}