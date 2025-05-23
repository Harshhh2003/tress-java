public class sumoftree{ public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
        }
    } public static int sumtree(node root){
        if(root == null) return 0;
        int lefttree = sumtree(root.left);
        int righthalf = sumtree(root.right);
        return lefttree  + righthalf + root.data;
    } 
    public static int heightoftree(node root){
        if(root == null) return 0;
        int lefttree = heightoftree(root.left);
        int righttree = heightoftree(root.right)
;
return Math.max(lefttree, righttree)    + 1; // 1 is for root node
 }
    public static void main(String[] args) {
        node root = new node(10);
        node a = new node(20);
        node b = new node(15);
        root.left = a;
        root.right = b;
        
        node c = new node(15);
        node d = new node(111);
        a.left = c;
        a.right = d;
        
        node e = new node(100);
        c.left = e;
System.out.println(" total sum of each node  is  :   "   +     sumtree(root));   
System.out.println("height of the tree is   :      "   +   heightoftree(root));     
        
    }
}