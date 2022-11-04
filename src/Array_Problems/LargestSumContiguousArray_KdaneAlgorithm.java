/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Problems;

/**
 *
 * @author MOHANISH
 */
public class LargestSumContiguousArray_KdaneAlgorithm {
    public static void main(String[] args) 
    {
        int[] arr = {-2, -3, -1};
        getMaxSubArray(arr);
    } 

    private static void getMaxSubArray(int[] arr) 
    {
        int maxSum=Integer.MIN_VALUE;
        int maxEndHere=0;
        for(int i=0;i<arr.length;i++)
        {
            maxEndHere+=arr[i];
            if(maxSum<maxEndHere)
            {
                maxSum=maxEndHere;
            }
            if(maxEndHere<0)
            {
                maxEndHere=0;
            }
        }
        System.out.println(maxSum);
    }
}
