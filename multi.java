import java.util.*;
class InputNumbers{
    int a,b;
    void getInput(Scanner sc){
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();

    }
}
class PowerCal extends InputNumbers{
    void power(){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Power "+a+" ^ "+b+" :"+result);
    }
}
class FactorialCal extends PowerCal{
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
            return fact;
    }
    void showFactorial(){
        System.out.println("Factorial of"+a+" : "+factorial(a));
        System.out.println("Factorial of"+b+" : "+factorial(b));;
    }

}
public class multi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        FactorialCal obj=new FactorialCal();
        obj.getInput(sc);
        obj.power();
        obj.showFactorial();
    }
    
}
