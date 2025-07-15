import java.util.*;
public class ListFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> fruits=new ArrayList<>();
        System.out.print("Enter the size of the List: ");
        int n=sc.nextInt();
        System.out.println("Enter the fruits into the List: ");
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the fruit: "+(i+1)+" ");
            String fruit=sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println("\n Fruits List: "+ fruits);
        System.out.print("Enter the index value : ");
        int index=sc.nextInt();
        if(index>=0 && index<n){
            System.out.println("The fruit at Index: "+index+" : "+fruits.get(index));
        }
        else{
            System.out.println("Not found : ");
        }
        sc.nextLine();
        System.out.print("Enter the fruit name to delete: ");
        String str=sc.nextLine();
        if(fruits.remove(str)){
            System.out.println(str+" ,delete from the list");
        }
        else{
            System.out.println(str+" : Not found");
        }
        System.out.println("The List of fruits are: "+fruits);
        sc.close();
    }
    
}
