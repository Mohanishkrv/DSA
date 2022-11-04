/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPs;

/**
 *
 * @author MOHANISH
 */
class A
{
   void show()
   {
       System.out.println("A");
   }
}
class B extends A
{
    @Override
    void show()
    {
        System.out.println("B");
    }
}
public class Method_overiding {
    public static void main(String[] args) 
    {
        B b=new B();
        b.show();
        A a=new A();
        a.show();
    }
    
}
