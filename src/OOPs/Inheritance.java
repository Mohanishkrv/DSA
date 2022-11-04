package OOPs;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

class Base
{
    Base()
    {
        System.out.println("Constructor Base Class");
    }
    Base(int x)
    {
        System.out.println("Parametrized Constructor Base Class");
    }
}

class Derived extends Base
{
    Derived()
    {
        System.out.println("Constructor derived Class");
    }
    Derived(int x,int y)
    {
        super(1);
        System.out.println("Parametrized Constructor Dervied Class");
    }
}

class ChildOfDerived extends Derived
{
    ChildOfDerived() 
    {
        System.out.println("Constructor ChildOfDerived class");
    }
    ChildOfDerived(int x,int y,int z)
    {
        System.out.println("Parametrized Constructor ChildOfDerived");
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        //Base b=new Base();
        //Derived d=new Derived();
        //ChildOfDerivedc=new ChildOfDerived();
        //Base b1=new Base(1);
        //Derived d1=new Derived(1,2);
        //ChildOfDerived c1=new ChildOfDerived(1,2,3);
        //Base b1=new Derived(1,2);
        //Base b1=new ChildOfDerived (1,2,3);
        //Derived d=new ChildOfDerived(1, 2, 3);
    }
}