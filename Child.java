/*
 Define a class Base with data members in string name and int age and member methods are getBaseData()
 showBaseData(). Define subclass child with data members String Branch and int sem and member methods are 
 getChildData() and showChildData(). Child is subclass that is derive from Base super class. Initialize an 
 object of Child class and access all its members methods as well as member methods of Super Class to show
 the existence of Inheritance amoung them. WAP in JAVA
 */
import java.util.Scanner;
class Base
{   
    private int age;
    private String name;
    Scanner sc=new Scanner(System.in);
    void getBaseData()
    {
        System.out.println("Enter Base Class Details");
        System.out.print("\nNAME : ");
        name=sc.nextLine();
        System.out.print("\nAGE : ");
        age=sc.nextInt();
    }

    void showBaseData()
    {
        System.out.println("Showing Base Class Details");
        System.out.print("\nNAME : "+name);
        System.out.print("\nAGE : "+age);
    }
}

class Child extends Base
{
    private int sem;
    private String branch;
    Scanner sc=new Scanner(System.in);
    void getChildData()
    {
        System.out.println("Enter Child Class Details");
        System.out.print("\nBRANCH : ");
        branch=sc.nextLine();
        System.out.print("\nSEMESTER : ");
        sem=sc.nextInt();
    }

    void showChildData()
    {
        System.out.println("\nShowing Child Class Details");
        System.out.print("\nNAME : "+branch);
        System.out.print("\nAGE : "+sem);
    }
    public static void main(String[] args)
    {
        Child ob=new Child();
        ob.getBaseData();
        ob.getChildData();
        ob.showBaseData();
        ob.showChildData();
    }
}