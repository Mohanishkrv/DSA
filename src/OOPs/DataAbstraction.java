/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPs;

/**
 *
 * @author MOHANISH
 */
abstract class Bike
{
    abstract void accelarate();
    abstract void brake();
}

class Ducati extends Bike
{
    @Override
    void brake() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

class Panigale extends Ducati
{
    void accelarate()
    {
        
    }
}
public class DataAbstraction {
    
}
