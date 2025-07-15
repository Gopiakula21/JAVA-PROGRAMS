import java.util.*;
interface MathOperation{
    int operate(int a,int b);
}
class Addition implements MathOperation{
    public int operate(int a,int b){
        return a+b;
    }
}
class Multiplication implements MathOperation{
    public int operate(int a,int b){
        return a*b;
    }
}
class Calculator{
    private MathOperation operation;
    public Calculator(MathOperation operation){
        this.operation=operation;
    }
    public void calculateAndDisplay(int a,int b){
       int result=operation.operate(a,b);
       System.out.println("Result: "+result);
    }
}
public class CouplingMathOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number: ");;
        int num1=sc.nextInt();
        System.out.println("Enter the Second Number: ");;
        int num2=sc.nextInt();
        System.out.println("Choose operatiom 1. ADD 2.MULTIPLY ");
        int choice=sc.nextInt();
        MathOperation operation;
        if(choice==1){
            operation = new Addition();
        }
        else{
            operation=new Multiplication();
        }
        Calculator op=new Calculator(operation);
        op.calculateAndDisplay(num1,num2);
        sc.close();
    }
    
}
