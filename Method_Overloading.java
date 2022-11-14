import java.util.Scanner;
public class Method_Overloading {
    int n1,n2;
    void add()
    {
        System.out.println("1st function Addition : "+(n1+n2));
    }
    static int add(int x, int y)
    {
        return (x+y);
    }
   static double add(double x, double y, double z)
    {
        double addi = (int)(x+y+z);
        return addi;
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Compute obj=new Compute();
        System.out.print("\nEnter Number 1 :");
        obj.n1=sc.nextInt();
        System.out.print("\nEnter Number 2 :");
        obj.n2=sc.nextInt();
        System.out.print("\nEnter Number 3 :");
        double num=sc.nextInt();

        obj.add();
        System.out.println("2st function Addition : "+add(obj.n1,obj.n2));
        System.out.println("1st function Addition : "+(int)add(obj.n1,obj.n2,num));
    }
}
