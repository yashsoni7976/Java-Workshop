import java.util.Scanner;
class functionByParameter
{
    void showdata(String a, int b, float c)
    {
        System.out.println("\nShowing Details");
        System.out.println("Name : "+a);
        System.out.println("AGE : "+b);
        System.out.println("CGPA : "+c);
    }

    public static void main(String arg[])
    {
        functionByParameter f1=new functionByParameter();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name :");
        String a=sc.nextLine();
        System.out.print("Enter Age :");
        int b=sc.nextInt();
        System.out.print("Enter CGPA :");
        float c=sc.nextFloat();
        f1.showdata(a,b,c);
    }
}
