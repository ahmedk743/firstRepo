/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasss;

/**
 *
 * @author hafiz
 */
public class AbstractClasss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        A obj;
        obj=new B();
        obj.set();
    }
    
}
abstract class A
{
    public abstract void set();
}
class B extends A
{
    public void set()
    {
        System.out.println("Child Class"+x);
    }
}
    
