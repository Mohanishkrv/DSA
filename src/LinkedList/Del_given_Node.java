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
public class Del_given_Node {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

        private Node() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    Node head=null;
    
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
        n.next=null;
    }
    
    public void traverse()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println();
    }
    
    public void del(int val) //O(n) O(1)
    {
        Node curr=head;
        Node prev=null;
        if(curr!=null && curr.data==val)//Corner case If head.data=val
        {
            head=curr.next;
            return;
        }
        while(curr.data!=val && curr!=null)//Base Case
        {
            prev=curr;
            curr=curr.next;
        }
        if(curr==null)//Corner case: Key not present in LL
        {
            return;
        }
        prev.next=curr.next;
    }
    //-------------------------------------------
    public Node getNode(int val)
    {
        Node curr=head;
        while(curr.data!=val)
        {
            curr=curr.next;
        }
        return curr;
    }
    public void del2(Node n)//O(1) O(1)
    {
        if(n==null)
            return;
        n.data=n.next.data;
        n.next=n.next.next;
        return;
    }
    public static void main(String[] args)
    {
        Del_given_Node l=new Del_given_Node();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(4);
        l.addNode(5);
        l.traverse();
        //l.del(3);
        //--------------------
        Node ptr=l.getNode(3);//get the pointer to the loaction where we want to del the node
        l.del2(ptr);
        l.traverse();
    }
}
