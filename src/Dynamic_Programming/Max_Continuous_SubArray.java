/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Programming;

/**
 *
 * @author ASUS
 */
public class Max_Continuous_SubArray {
    public static void main(String[] args)
    {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(dynamic_programming_maxSubArray(arr,arr.length));
    }
    
    private static int dynamic_programming_maxSubArray(int[] arr, int length) //Dynamic Programming
    {
        int max_so_far=arr[0];
        int curr_max=arr[0];
        for(int i=1;i<length;i++)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
