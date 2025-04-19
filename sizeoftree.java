public class sizeoftree{
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
        }
    } public static int size(node root){
        if(root==null) return 0;
        int lefthalf  = size(root.left);
        int righthalf = size(root.right);
        return lefthalf+ righthalf + 1;
    } public static void main(String[] args) {
        node root = new node(10);
        node a =  new node(20);
        node b = new node(15);
        root.left=a;
        root.right =b;
           node  c = new node (15);
           node d = new node (111);
           a.left = c;
           a.right = b;
           node e = new node (100);
           c.left = e;
           System.out.println("size of tree is  " +  size(root));
    }
}