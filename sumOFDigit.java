//WAJP to print sum of Digits
import java.util.Scanner;
class Sum_of_Digit
{
    int num,sum=0;
    int sumDigit()
    {
        while(num!=0)
        {
            int temp = num%10;
            sum+=temp;
            num/=10;
        }
        return sum;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Sum_of_Digit ob = new Sum_of_Digit();
        System.out.print("Enter Number : ");
        ob.num=sc.nextInt();
        System.out.print("\nSum of Number is : "+ob.sumDigit());
    }

}
