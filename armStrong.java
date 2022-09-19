import java.util.Scanner;
import java.lang.Math;
class armStrong {
    public static void main(String[] args) {
        int num,sum=0,count=0;
        try (Scanner obj = new Scanner(System.in)) {
            num=obj.nextInt();
        }
        int temp=num;
        while(temp>0) {
            count++;
            temp/=10;
        }
        temp=num;
        while(temp>0) {
            int newNum=temp%10;
            sum+=Math.pow(newNum,count);
            temp/=10;
        }
        if(sum==num)
        System.out.println("Arm Strong");
        else
        System.out.println("Not Arm Strong");
    }
}
