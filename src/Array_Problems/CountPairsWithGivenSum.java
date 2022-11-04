/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Problems;

import java.util.HashMap;

/**
 *
 * @author MOHANISH
 */
public class CountPairsWithGivenSum { 
    public static void main(String[] args) {
        int arr[]={1,5,7,1,5,5};
        int sum=6;
        countPairs(arr,sum);
        
    }
    //Value as frequency and Key as main no
    public static void countPairs(int[] arr, int sum) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
            
        {
            if(h.containsKey(sum-arr[i]))
            {
                count+=h.get(sum-arr[i]);
            }
            if(h.containsValue(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else
            {
                h.put(arr[i], 1);
            }
        }
        System.out.println(count);
    }
    
}
