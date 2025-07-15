import java.util.*;
public class simplethrow{
    static void validateScore(int score){
        if(score<0||score>100){
            throw new IllegalArgumentException("Score is above range");
        }
        else{
            System.out.println("Valid score: "+score);
        }
        
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try{
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        validateScore(num);
    } 
      catch(IllegalArgumentException e){
        System.out.println("Exception caught: "+e.getMessage());
      } 
      finally{
        sc.close();
      }
    }
}