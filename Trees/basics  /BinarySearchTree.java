class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }

}
class Main{
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(key<root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String[] args){
        Node root=null;
        root=insert(root,50);
        insert(root,30);
        insert(root,20);
        insert(root,40);
        insert(root,70);
        insert(root,60);
        insert(root,80);

        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println("\nSearch 40: " + search(root, 40));
        
    }
}
/*
Output :
Inorder Traversal:
20 30 40 50 60 70 80 
Search 40: true */
