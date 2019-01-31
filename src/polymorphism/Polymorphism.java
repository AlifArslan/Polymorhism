
package polymorphism;
 
import java.util.ArrayList;
interface It1
{
    int b = 3333;
    int a = 1111;
    void m1();
}
interface It2
        {
    int a = 2222;
    void m1();
}

public class Polymorphism implements It1, It2{

    @Override
    public void m1()
    {
        System.out.println("m1");
        System.out.println("b : "+b);
        System.out.println("a of It1 : "+It1.a);
        System.out.println("a of It2 : "+It2.a);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        Polymorphism i = new Polymorphism();
        i.m1();
        
        //It1 i2 = new Polymorphism();
        //It2 i3 = new Polymorphism();
        
    }   
}
