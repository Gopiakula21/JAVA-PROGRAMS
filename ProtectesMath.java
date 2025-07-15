import java.util.*;
class Square{
    protected int num;
    protected void getNumber(int num){
        this.num=num;
    }
    protected void displaySquare(){
        int squ=num*num;
        System.out.println("Square: "+squ);
    }
}
class Cube extends Square{
    protected void displayCube(){
        int cub=num*num*num;
        displaySquare();
        System.out.println("Cube: "+cub);

    }
}
public class ProtectesMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        Cube obj=new Cube();
        obj.getNumber(num);
        obj.displayCube();
        sc.close();
    }
    
}
