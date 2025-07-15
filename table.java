import java.util.*;
class table{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+(n*i));
            i++;
        }
    }
}