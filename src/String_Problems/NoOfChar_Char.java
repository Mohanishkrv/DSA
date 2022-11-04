/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Problems;

/**
 *
 * @author MOHANISH
 */
public class NoOfChar_Char {
    public static void main(String[] args) {
        String s="aaabbccccdddddd";
        getNewString(s);
    }

    private static void getNewString(String s) 
    {
        int count=1;
        String res="";
        char running_char=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(running_char==s.charAt(i))
            {
                count++;
            }
            else
            {
                res=res+running_char+count;
                count=1;
                running_char=s.charAt(i);
            }
        }
        res=res+running_char+count;
        System.out.println(res);
    }
}
