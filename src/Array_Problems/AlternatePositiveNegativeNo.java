/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Problems;

/**
 *
 * @author MOHANISH
 */
public class AlternatePositiveNegativeNo {
    public static void main(String[] args) {
        int arr[] = {1,-1,1,-1,1,-1};
        alternateSort(arr);
    }

    private static void alternateSort(int[] arr) 
    {
        int x=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0 )
            {   
                x++;
                swap(arr,i,x);
            }
        }
        int positive=x+1,negative=0;
        while(positive<arr.length && negative<positive  && arr[negative]<0)
        {
            swap(arr,positive,negative);
            positive+=2;
            negative+=2;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

    private static void swap(int[] arr, int i, int x) 
    {
        int temp=arr[i];
        arr[i]=arr[x];
        arr[x]=temp;
    }
}
