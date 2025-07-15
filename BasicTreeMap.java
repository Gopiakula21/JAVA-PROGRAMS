import java.util.*;
public class BasicTreeMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of countries: ");
        int count=sc.nextInt();
        TreeMap<String,String> capitalcity=new TreeMap<>();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the Country Name: "+(i+1));
            String cou=sc.nextLine();
            System.out.print("Enter the capital Name: ");
            String cap=sc.nextLine();
            capitalcity.put(cou,cap);
        }
        for(Map.Entry<String,String> entry:capitalcity.entrySet()){
            System.out.println(entry.getKey()+"=> is "+entry.getValue());
        }
        sc.close();
    }
    
}
