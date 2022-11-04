/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ASUS
 */
public class Operations {

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    Node head=null;
    
    public void addAtFront(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    
    public void traverse() 
    {
        Node curr=head;
        if(curr==null)
        {
            System.out.println("LL is empty");
            return;
        }
        while(curr!=null)
        {
            System.out.print(curr.data+"--> ");
            curr=curr.next;
        }
    }
    
    
    public static void main(String[] args)
    {
        Operations LL=new Operations();
        LL.addAtFront(1);
        LL.addAtFront(2);
        LL.addAtFront(3);
        LL.traverse();
    }
}
