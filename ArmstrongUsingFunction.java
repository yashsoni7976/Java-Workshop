import java.lang.Math;
import java.util.Scanner;
class ArmstrongUsingFunction
{
    int count=0;
    void findNoOfDigit(int num)
    {
        while(num!=0)
        {
            count++;
            num/=10;
        }
    }
    int findingSumofDigit(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int temp=num%10;
            sum+=(Math.pow(temp,count));
            num/=10;
        }
        return sum;
    }

    public static void main(String arg[])
    {
        ArmstrongUsingFunction f1=new ArmstrongUsingFunction();
        Scanner sc=new Scanner(System.in);
        int numb;
        System.out.print("Enter number : ");
        numb=sc.nextInt();
        f1.findNoOfDigit(numb);
        int res=f1.findingSumofDigit(numb);
        if(res==numb)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
