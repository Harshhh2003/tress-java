public class  inordertraverssal{
    public static class node{
        int data; node left ; node right;
        node(int data){
            this.data = data;
        }
    }
    
    public static void inordertraversal(
        node root){
            if(root == null) return;
            inordertraversal(root.left);
            System.out.print(root.data +  "   ");
            inordertraversal(root.right);

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
        inordertraversal(root);
        
    }
}