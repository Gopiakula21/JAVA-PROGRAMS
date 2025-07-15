import java.util.*;
public class areaofcircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("The area of a circle is: "+area);
        System.out.printf("The area of for radius %.2f is %.2f",radius,area);
        sc.close();
    }

}