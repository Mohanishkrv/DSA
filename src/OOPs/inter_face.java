package OOPs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MOHANISH
 */
interface A
{
    void show();
    
}

interface B
{
    void show();
}

class AB implements A,B
{

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
public class inter_face 
{
    public static void main(String[] args) 
    {
        Derived1 d=new Derived1();
        d.show();
    }
}
