import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]) {
        int year;
        boolean leap;
        try(Scanner obj=new Scanner(System.in)){
        System.out.print("Enter Year : ");
        year=obj.nextInt();
        if(year%4==0 && year%100==0 && year%400==0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
        }
    }
}
