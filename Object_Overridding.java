//Define a Class Base with method show(). Define a subclass inherite the Base class. 
//child is a class modifies the definition of show method prove that for derived method show method two different definition exist in both the class
//Implement this program in Java.

class Base
{
    void show()
    {
        System.out.println("Base Class");
    }
}

class Child extends Base
{
    void show()
    {
        System.out.println("Child Class");
    }
}

public class Main
{
    public static void main(String[] args) {
    {
        Base b;
        Base bh=new Base();
        Child ch=new Child();
        b=bh;
        b.show();
        b=ch;
        b.show();
    }
}
}
