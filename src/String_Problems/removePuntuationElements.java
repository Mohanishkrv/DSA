/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Problems;

/**
 *
 * @author MOHANISH
 */

/*
Punctuation Elements Are : ! " # $ % & ' ( ) * + , - . / : ; ? @ [ \ ] ^ _ ` { | } ~ 
*/
public class removePuntuationElements {
    public static void main(String[] args) {
        String s="Hello!!!, he said ---and went.";
        System.out.println(s.replaceAll("\\p{Punct}",""));
    }
}
