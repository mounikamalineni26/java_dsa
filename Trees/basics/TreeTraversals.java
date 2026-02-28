class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }

}
// Time Complexity = O(n)
// Space Complexity  = O(h)

class TreeTraversals{
    public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+ " ");
    inorder(root.right);
   }
   public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+ " ");
    preorder(root.left);
    preorder(root.right);
   }
   public static void postorder(Node root){
    if(root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+ " ");
    
   }
   public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("\nPreorder Traversal:");
        preorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
        
    }
}
/*
Output: 
Inorder Traversal:
4 2 5 1 3 
Preorder Traversal:
1 2 4 5 3 
Postorder Traversal:
4 5 2 5 3 1  */
