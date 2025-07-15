import java.util.*;
class Person{
    protected String name;
    protected void setName(String name){
        this.name=name;
    }
    protected void displayName(){
        System.out.println("The name of a boy is: "+name);
    }
}
class boy extends Person{
    protected float height;
    protected void setHeight(float height){
        this.height=height;
    }
    protected void displayHeight(){
        System.out.println("The height of a boy is: "+height);
    }
}
public class Protected{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boy obj=new boy();
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        obj.setName(name);
        System.out.print("Enter the height of the boy: ");
        float height=sc.nextFloat();
        obj.setHeight(height);
        System.out.println("-------The Details of a boy--------");
        obj.displayName();
        obj.displayHeight();

    }
    
}
