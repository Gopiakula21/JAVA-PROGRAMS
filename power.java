import java.util.*;
public class power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int bas=sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp=sc.nextInt();
        double po=Math.pow(bas,exp);
        System.out.printf("The power of the base: %d and exponent: %d is power=%f",bas,exp,po);
        sc.close();
    }
}