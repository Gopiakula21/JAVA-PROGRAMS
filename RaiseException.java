import java.util.*;
public class RaiseException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num<0){
            throw new ArithmeticException("Negative Numbers are not allowed");
        }
        else{
            System.out.println("Your entered number is : "+num);
        }
        sc.close();
    }
    
}