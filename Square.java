import java.util.Scanner;
import java.lang.Math;

public class Square {
    int num;

    public void calculate(int x) {
        num = (int) Math.pow(x, 2);
    }

    public void showResult() {
        System.out.println("Square of Number is " + num);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        Square sq = new Square();
        int x1 = sc.nextInt();
        sq.calculate(x1);
        sq.showResult();
    }
}
