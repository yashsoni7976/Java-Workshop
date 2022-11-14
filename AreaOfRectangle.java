// WAJP to calculate Area of Rectangle
import java.util.Scanner;
public class ReactangleArea {
    int reactArea(int x, int y)
    {
        return (x*y);
    }
    public static void main(String arg[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length and Breadth of Rectangle : ");
        x=sc.nextInt();
        y=sc.nextInt();
        ReactangleArea ob=new ReactangleArea();
        System.out.print("\nArea of Rectangle : "+ob.reactArea(x, y));
    }
}
