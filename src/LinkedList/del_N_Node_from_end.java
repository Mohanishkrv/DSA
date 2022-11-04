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
public class del_N_Node_from_end {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }

        Node() 
        {
            
        }
    }
    static Node head=null;
    public void addNode(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
    } 
    public static void traverse()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public Node delFromEnd(int n) //O(n) O(1)
    {
        Node start=new Node();
        start.next=head;
        Node fast=start;
        Node slow=start;
        
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        //Since fast has traverse n times so it will start from there
        //while slow will start from starting of list 
        //and in that way slow will stop at length-k+1
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;//return head
        
    }
    
    public static void main(String[] args)
    {
        del_N_Node_from_end l=new del_N_Node_from_end();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        l.addNode(5);
        l.traverse();
        l.delFromEnd(2);
        l.traverse();
    }
}
