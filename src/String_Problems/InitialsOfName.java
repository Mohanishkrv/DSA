/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Problems;

/**
 *
 * @author MOHANISH
 */
public class InitialsOfName {
    public static void main(String[] args) {
        String s="Mohanish Kumar Verma";
        getInitials(s);
    }

    private static void getInitials(String s) 
    {
        String Words[]=s.split(" ");
        for(String w:Words)
        {
            System.out.print(w.charAt(0)+" ");
        }
    }
}
