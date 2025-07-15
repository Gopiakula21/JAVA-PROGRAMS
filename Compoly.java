import java.util.*;
class MathOper{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Compoly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MathOper obj=new MathOper();
        System.out.println("addition: "+obj.add(2,3));
        System.out.println("addition: "+obj.add(3.5623,5.256));
        System.out.println("addition: "+obj.add(2,3,5));
    }
    
}
