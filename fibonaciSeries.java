import java.util.Scanner;
public class fibonaciSeries {
    int x,y,ele;
    void Fibonaci() {
        for(int i=0;i<ele;i++){
            int z=x+y;
            x=y;
            y=z;
            System.out.print(z+",");
        }
    }
    public static void main(String args[]) {
        
        fibonaciSeries ob=new fibonaciSeries();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many Elements you want to print : ");
            ob.ele=sc.nextInt();
        }
        ob.x=0;
        ob.y=1;
        ob.Fibonaci();
        
        
    }
    
}