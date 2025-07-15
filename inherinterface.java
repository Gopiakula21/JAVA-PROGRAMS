import java.util.*;
interface addition{
    void add();
}
interface multiplication extends addition{
    void mul();
}
class Calculator implements multiplication{
    double a;
    double b;
    Calculator(double a,double b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println("Addition: "+(a+b));
    }
   public void mul(){
        System.out.println("Multiplication: "+(a*b));
    }

}

public class inherinterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number: ");
        double num=sc.nextDouble();
        System.out.print("Enter a second number: ");
        double num2=sc.nextDouble();
        Calculator cal=new Calculator(num, num2);
        cal.add();
        cal.mul();
        

    }
    
}
