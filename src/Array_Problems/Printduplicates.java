/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Problems;

import java.util.HashSet;

/**
 *
 * @author MOHANISH
 */
public class Printduplicates {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,1};
        duplicateElements(arr);
    }

    private static void duplicateElements(int[] arr) 
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.add(arr[i])==false)
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
