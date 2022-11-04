/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author ASUS
 */
public class BT_Rec_Traversals {
    static class Node
    {
        int data;
        Node left,right;
        Node(int item)
        {
            data=item;
            left=right=null;
        }
    }
    Node root;
    public void preOrderTraversal() 
    {
        preOrder(root);
    }
    
    public void preOrder(Node n) 
    {
        if(n==null)
        {
            return;
        }
        System.out.print(n.data+" ");
        preOrder(n.left);
        preOrder(n.right);
    }
    public void inOrderTraversal() 
    {
        inOrder(root);
    }
    
    public void inOrder(Node n) 
    {
        if(n==null)
        {
            return;
        }
        inOrder(n.left);
        System.out.print(n.data+" ");
        inOrder(n.right);
    }
    
    public void postOrderTraversal() 
    {
        postOrder(root);
    }
    
    public void postOrder(Node n) 
    {
        if(n==null)
        {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data+" ");
    }

 
    public static void main(String[] args)
    {
        BT_Rec_Traversals bt=new BT_Rec_Traversals();
        bt.root=new Node(1);
        bt.root.left=new Node(2);
        bt.root.right=new Node(3);
        bt.root.left.left=new Node(4);
        bt.root.left.right=new Node(5);
        System.out.println("Pre-Order Traversal[DLR]"); //DLR
        bt.preOrderTraversal();
        System.out.println("In-Order Traversal[LDR]"); //DLR
        bt.inOrderTraversal();
        System.out.println("Post-Order Traversal[LRD]"); //DLR
        bt.postOrderTraversal();
    }

}
