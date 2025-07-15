import java.util.*;
public class HashMapp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // int value=sc.nextInt();
        HashMap<String,Integer> PriceMap=new HashMap<>();
        System.out.print("No of Products: ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the Product Name: ");
            String product=sc.nextLine();
            System.out.print("Enter the price of the product: ");
            int price=sc.nextInt();
            sc.nextLine();
            PriceMap.put(product,price);
        }
        //adding elements in HashMap
        System.out.println("\n Product Price list: ");
        for(Map.Entry<String,Integer>entry:PriceMap.entrySet()){
            System.out.println(entry.getKey()+" => RS "+entry.getValue());
        }
        // searching product
        System.out.println("Enter the Product Name: ");
        String pro=sc.nextLine();
        if(PriceMap.containsKey(pro))
        {
            System.out.println("Price of : "+pro+" is RS: "+PriceMap.get(pro));
        }
        else{
            System.out.println("Product Not Found");
        }
        // removing items
        System.out.println("Enter the product to remove: ");
        String str=sc.nextLine();
        if(PriceMap.remove(str)!=null){
            System.out.println(str+" is : removed");
        }
        else{
            System.out.println("Updated Items List are: ");
            for(Map.Entry<String,Integer>entry:PriceMap.entrySet()){
                System.out.println(entry.getKey()+"=> RS is: "+entry.getValue());
            }
        }
        // finally updated list 
        // after removing
        System.out.println("Updated Items List are: ");
            for(Map.Entry<String,Integer>entry:PriceMap.entrySet()){
            System.out.println(entry.getKey()+"=> RS is: "+entry.getValue());
            }
        sc.close();

    }
    
}
