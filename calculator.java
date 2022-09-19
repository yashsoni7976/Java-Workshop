import java.util.Scanner;

public class calculator {
    void addition(int x, int y) {
        System.out.print("Addition is "+(x+y));
    }
    void subtraction(int x, int y) {
        System.out.print("Subtraction is "+(x-y));
    }
    void multiplication(int x, int y) {
        System.out.print("Multiplication is "+(x*y));
    }
    void division(int x, int y) {
        System.out.print("Division is "+(float)(x/y));
    }

    public static void main(String args[]) {
        calculator calc=new calculator();
        try (Scanner sc = new Scanner(System.in)) {
            int n1,n2,cho;
            int ch;
            do {
                System.out.println("Enter 2 Numbers : ");
                n1=sc.nextInt();
                n2=sc.nextInt();
                System.out.println("Choose Option");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                cho=sc.nextInt();
                switch(cho) {
                    case 1: calc.addition(n1,n2);
                            break;
                    case 2: calc.subtraction(n1, n2);
                            break;
                    case 3: calc.multiplication(n1, n2);
                            break;
                    case 4: calc.division(n1, n2);
                            break;
                    default : System.out.print("Invalid choice");
                }
                System.out.println("\nWant to Continue (1 or 2) : ");
                ch=sc.nextInt();
            }while(ch==1);
        }
    }
}
