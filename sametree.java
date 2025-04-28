public class sametree{
    public static class node{
        int data;
        node left , right;
        node (int data){
            this.data = data;

        } } public static boolean isametree(node root1 , node root2){
        if(root1 == null && root2== null) return true;
        if(root1 == null || root2 == null) return false;
        return ( root1.data == root2.data) &&
        isametree(root1.left, root2.left)&& isametree(root1.right, root2.right);

    }
    public static void main(String[] args) {
        node root1 = new node(1);
        root1.left = new node(2);
        root1.right = new node(1);

        node root2 = new node(1);
        root2.left = new node(4);
        root2.right = new node(1);
        if(isametree(root1, root2)){
            System.out.println("same tree ");
        }
    else{
        System.out.println(" not same tree");
    }
}
    
}