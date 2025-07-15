import java.util.*;
public class BasicSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int num=sc.nextInt();
        sc.nextLine();
        Set<String> cities=new HashSet<>();
        for(int i=0;i<num;i++){
            System.out.print("Enter the city "+(i+1)+" is : ");
            String str=sc.nextLine();
            cities.add(str);
        }
        System.out.println("\nUnique Cities: ");
        for(String city:cities){
            System.out.println(city);
        }
        sc.close();
        }

    }
    
