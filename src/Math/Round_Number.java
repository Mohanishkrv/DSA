/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Math;

/**
 *
 * @author MOHANISH
 */
public class Round_Number {
    public static void main(String[] args) {
        int n=128;
        System.out.println(roundNo(n));
    }

    private static int roundNo(int n) 
    {
        int a=(n/10) *10;
        int b=a+10;
        return ( (n-a)>(b-n) ? b : a );
    }
}
