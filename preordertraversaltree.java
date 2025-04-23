public class preordertraversaltree{
    public static class node{
        int data ;
        node left;
        node right;
        node(int data){
            this.data = data;

        } }
    public static void preordertraversaltree(node root){
        if(root ==null) return;
        System.out.println(root.data   +    "     ->  ");
      preordertraversaltree(root.left);
      preordertraversaltree(root.right);

    }
    public static void main(String[] args) {
        node root = new node(10);
        node a = new node(5);
        node b = new node(20);
        root.left = a;
        root.right =b;
        node  c = new node(1);
        node d = new node(7);
        a.left =c;
        a.right = d;
        preordertraversaltree(root);
        
    }
}