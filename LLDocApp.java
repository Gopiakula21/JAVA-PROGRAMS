import java.util.*;
public class LLDocApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> waitingList=new LinkedList<>();
        while (true) {
            System.out.println("\n===Doctor's Appointment System====");
            System.out.println("1.Add patient");
            System.out.println("2.Served patient");
            System.out.println("3.Waiting List");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            int num=sc.nextInt();
            switch(num){
                case 1: System.out.println("Enter the patient name: ");
                sc.nextLine();
                String name=sc.nextLine();
                waitingList.addLast(name);
                System.out.println(name+ "is added to Waiting List");
                break;
                case 2: if(!waitingList.isEmpty()){
                    String served=waitingList.removeFirst();
                    System.out.println(served+", has been visited by doctor");
                }
                else{
                    System.out.println("No Patients in the queue");
                }
                break;
                case 3: System.out.println("Current Waiting List: "+waitingList);
                break;
                case 4:System.out.println("Existed System. thank you");
                sc.close();
                return;
                default:System.out.println("Invalid Choice");
               
            }

            
        }
    }
    
}
