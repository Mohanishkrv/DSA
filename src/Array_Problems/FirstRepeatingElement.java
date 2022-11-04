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
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[]={7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};
        System.out.println(firstRepeated(arr,arr.length));
    }
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
            {
                return (h.get(arr[i]));
            }
            else
            {
                h.put(arr[i],i);
            }
        }
        return -1;
    }
}
