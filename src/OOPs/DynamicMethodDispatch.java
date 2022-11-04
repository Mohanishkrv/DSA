/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPs;

/**
 *
 * @author MOHANISH
 */

class Phone
{
    void on()
    {
        System.out.println("Turning phone on...");
    }
    
    void calling()
    {
        System.out.println("Making a call");
    }
}
class Smartphone extends Phone
{
    @Override
    void on()
    {
        System.out.println("Turing smartphone on...");
    }
    void music()
    {
        System.out.println("Playing Music");
    }
}
public class DynamicMethodDispatch 
{
    public static void main(String[] args) 
    {
        Phone obj=new Smartphone();
        obj.on();           
        //obj.music();
        obj.calling();
    }
}
