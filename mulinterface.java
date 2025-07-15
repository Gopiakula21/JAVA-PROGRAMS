import java.util.*;
    interface area{
        double Carea();
}
    interface perimeter{
        double Cper();
} 
class Rectangle implements area,perimeter{
    double length;
    double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public double Carea(){
        return length*breadth;
    }
    public double Cper(){
        return 2*(length+breadth);
    }
}
public class mulinterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:  ");
        double l=sc.nextDouble();
        System.out.print("Enter the breadth:  ");
        double b=sc.nextDouble();
        Rectangle s=new Rectangle(l, b);
        System.out.println("Area:  "+s.Carea());
        System.out.println("Area:  "+s.Cper());
        sc.close();
    }
    
}
