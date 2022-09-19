import java.util.Scanner;
public class AverageOFNumber {
    public static void main(String args[]){
        int x,y,z;
        int avg;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 3 Numbers : ");
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            avg=(x+y+z)/3;
            float aver= (float) avg;
            System.out.println(avg);
            System.out.print(aver);
        }
        
    }
}
