import java.util.*;
class Mathop{
    int x,y;
    void setValues(int x,int y){
        this.x=x;
        this.y=y;
    }

    void calValues(){
        System.out.println("the sum of "+x+" and "+y+" is: "+(x+y));
    }
}
    class proOp extends Mathop{
        @Override
        void calValues(){
            System.out.println("The Product of the values "+x+" and "+y+" is: "+(x*y));
        }
    } 

public class Coverride {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        proOp obj=new proOp();
        obj.setValues(x,y);
        obj.calValues();

    }
    
}
