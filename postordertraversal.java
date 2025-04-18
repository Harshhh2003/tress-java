import org.w3c.dom.Node;

public class postordertraversal{
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;

        }
    }public static void postordertraversal(node root){
        if(root == null) return;
       postordertraversal(root.left);
       postordertraversal(root.right);
       System.out.println(root.data +  "   ");
    }
    public static void main(String[] args) {
         node root = new node(10);
        node a = new node(5);
        node b = new node(20);
        root.left = a;
        root.right = b;
        node c = new node(1);
        node d = new node(7);
        a.left = c;
        a.right = d;
        postordertraversal(root);

        
    }
}