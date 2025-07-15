import java.util.*;
interface Shape{
    double area();
    double perimeter();
} 
class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class sininterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:  ");
        double l=sc.nextDouble();
        System.out.print("Enter the breadth:  ");
        double b=sc.nextDouble();
        Shape s=new Rectangle(l, b);
        System.out.println("Area:  "+s.area());
        System.out.println("Area:  "+s.perimeter());
    }
    
}
