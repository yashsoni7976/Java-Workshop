import java.util.Scanner;
public class programUsingClass {
    int x;
    public static void main(String args[]) {
        programUsingClass ob=new programUsingClass();
        try(Scanner sc=new Scanner(System.in);) {
            System.out.print("Enter Number : ");
            ob.x=sc.nextInt();
            System.out.println("Entered Number is "+ob.x);
        }
    }
}
