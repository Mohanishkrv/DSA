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
public class SubarrayWithSumNegative {
    public static void main(String[] args) {
        int arr[]={10, 2, -2, -20, 10};
        int sum=-2;
        getSubArray(arr,sum);
    }

    private static void getSubArray(int[] arr, int sum) 
    {
        int currSum=0,start=0,end=-1;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            if(currSum==sum)
            {
                start=0;
                end=i;
                break;
            }
            if(h.containsKey(currSum-sum))
            {
                start=h.get(currSum-sum)+1;
                end=i;
                break;
            }
            h.put(currSum, i);
        }
        if(end==-1)
            System.out.println("No SubArray");
        else
            System.out.println(start+"-"+end);
    }
   
}
