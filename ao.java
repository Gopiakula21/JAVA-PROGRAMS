import java.util.*;
class Arithmetic{
    void performance(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        sc.close();

    }
}
public class ao {
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        obj.performance();
    }
    
}
