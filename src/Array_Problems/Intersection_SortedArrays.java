/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Problems;

/**
 *
 * @author MOHANISH
 */
public class Intersection_SortedArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={3,4,5,6,7,8};
        intersection(a,b);
    }

    private static void intersection(int[] a, int[] b)
    {
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
            {
                System.out.println(a[i]+" ");
                i++;
                j++;
            }   
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
    }
}
