import java.util.*;
class Fact{
    int n;
    void setValues(int n)
        {
            this.n=n;
        }
    void calValues(){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("The factorial of a number is : "+fact);
    }
    }
    class Exp extends Fact{
        int x,y;
        void setValue(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        void calValues(){
            int pow=1;
            if(y==0){
                System.out.println(1);
            }
            else{
            for(int i=1;i<=y;i++){
                pow=pow*x;
            }
            }
            System.out.println("The exponet of a number is: "+pow);

        }
    }
public class FactAndExp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int num=sc.nextInt();
        System.out.println("Enter the value of y: ");
        int num1=sc.nextInt();
        Fact obj =new Fact();
        obj.setValues(num);
        obj.calValues();
        obj.setValues(num1);
        obj.calValues();
        Exp obj1=new Exp();
        obj1.setValue(num,num1);
        obj1.calValues();
    }
    
}
