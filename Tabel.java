import java.util.Scanner;
public class Tabel {
    public static void main(String[] args) {
        int num;
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            num=obj.nextInt();
        }
        System.out.println("Printing Table-:");
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
