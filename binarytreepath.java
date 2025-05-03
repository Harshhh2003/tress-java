public class binarytreepath{
    public static class node{
        int data;
     node left , right;
        node(int data){
            this.data = data;

        }

    }
     static void samepath(node root , String path){
    if(root == null ) return;
    path = path + root.data;

    if(root.left == null && root.right == null){
        System.out.println(path);
} else{
   path += "->";
        samepath(root.left, path);
        samepath(root.right, path);

    }
     }
    public static void main(String[] args) {
        node root = new node(5);
        root.left = new node(2);
        root.right = new node(4);
        root.right.left = new node(100);
 
        samepath(root, "");
    }
}