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
public class Middle_element {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    
    public void aNode(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        n.next=null;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
    }
    
    public void traverse()
    {
        if(head==null)
        {
            return;
        }
        else
        {
            Node curr=head;
            while(curr!=null)
            {
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
        }
    }

    public void mid_ele()
    {
        Node slow_ptr=head;
        Node fast_ptr=head;
        while(fast_ptr!=null && fast_ptr.next!=null)//if condition order is changed it will cause error for even no of entries
        {//if changed causes null pointer Exxception
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
        }
        System.out.println(slow_ptr.data);
    }
    
    //Second method by counting no of elements
    
    public static void main(String[] args)
    {
        Middle_element l=new Middle_element();
        l.aNode(1);
        l.aNode(2);
        l.aNode(3);
        l.aNode(4);
        //l.aNode(5);
        l.traverse();
        System.out.println();
        l.mid_ele();//O(n) O(1)
    }
    
}
