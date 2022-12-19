// WAJP to calculate Area of Triangle and Rectangle using Inheritance. Take the input from The User

import java.util.Scanner;
class Area
{
    int l,bre,h,ba;
    Scanner sc=new Scanner(System.in);
    public void Rectangle()
    {
        System.out.println("Enter Length and Breadth of : ");
        l=sc.nextInt();
        bre=sc.nextInt();
    }
    public void Triangle()
    {
        System.out.println("Enter Base and height of : ");
        ba=sc.nextInt();
        h=sc.nextInt();
    }
}

class ShowArea extends Area
{
    void AreaRectangle()
    {
        System.out.print("\n Area of Rectangle : "+ (l*bre));
    }
    void AreaTriangle()
    {
        System.out.print("\n Area of Triangle : "+ (h*ba)/2);
    }
}

public class Main
{
    public static void main(String[] args) {
        ShowArea ob=new ShowArea();
        ob.Rectangle();
        ob.Triangle();
        ob.AreaRectangle();
        ob.AreaTriangle();
    }
}
