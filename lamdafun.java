import java.util.*;
@FunctionalInterface
interface operation{
    int compute(int a,int b);
}
public class lamdafun {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Operation add=(a,b)->a+b;
        Operation sub=(a,b)->a-b;
        Operation mul=(a,b)->a*b;
        Operation div=(a,b)->b!=0?a/b:0;
        System.out.println("Addition: "+add.compute(x,y));
        
        

    }
    
}
