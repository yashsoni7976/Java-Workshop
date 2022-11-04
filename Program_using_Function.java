import java.util.Scanner;
class Program_using_Function
{
    String str;
    int i;
    float f;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
        str=sc.nextLine();
        i=sc.nextInt();
        f=sc.nextFloat();
    }
    void showdata()
    {
        System.out.println(str);
        System.out.println(i);
        System.out.println(f);
    }

    public static void main(String arg[])
    {
        Program_using_Function f1=new Program_using_Function();
        f1.getdata();
        f1.showdata();
    }
}
