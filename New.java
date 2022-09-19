import java.util.Scanner;
class A {
    public static void main(String[] args) {
        int range;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Range : ");
        range=ob.nextInt();
        //for(int i=1; i<=range; i++) {
        if(range%2==0 || range%3==0 || range%5==0 || range%7==0)
            System.out.println(range+" not Prime");
        else
            System.out.println(range+" is Prime");
        //}
    }
}