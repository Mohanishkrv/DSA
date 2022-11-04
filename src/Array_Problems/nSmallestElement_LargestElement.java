/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_Problems;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author ASUS
 */
public class nSmallestElement_LargestElement {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        kLargest(arr, k);
        ksmallest(arr, k);
    }

    public static void kLargest(int arr[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;++i)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
    
    public static void ksmallest(int[] arr,int k) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
    
}
