
package polymorphism;

class Parent
{
    static void m1()
    {
        System.out.println("parent m1");
    }
}


 class MethodHiding extends Parent
{
    
    static void m1()
    {
        System.out.println("Child m1");
        
    }
    public static void main(String[] args) {
        Parent p = new MethodHiding();
        p.m1();
        
    
        
    }
}
