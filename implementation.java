public class implementation{
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        node root = new node(10);
       
      System.out.println(root.data); // 10 o/p
      System.out.println(root.right); // null val
      System.out.println(root.left); // also null
       root.left = new  node(4); // now the val of left node / left child is  4
root.right = new node(10);
System.out.println(root.left.data); // 4  ans
System.out.println(root.right.data); // 10 ans

        
    }
}