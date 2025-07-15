import java.util.*;
class Notification{
    void NotifyUser(){
        System.out.println("Sending a general Notification");
    }
}
class EmailNotification extends Notification{
    void NotifyUser(){
        System.out.println("Sending E-mail notification to abc@example.com");
    }
}
class SMSNotification extends Notification{
    void NotifyUser(){
        System.out.println("Sending SMS Notification to +91-9876543210");
    }
}
class pushNotification extends Notification{
    void NotifyUser(){
        System.out.println("Sending push Notification mobile app-whatapp");
    }
}
public class notifpoly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Notification notify;
        System.out.print("Enter your choice: ");
        System.out.println("1.Email");
        System.out.println("2.SMS");
        System.out.println("3.Whatsapp");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                   notify=new EmailNotification();
                   break;
            case 2:
                   notify=new SMSNotification();
                   break;
            case 3: 
                   notify=new pushNotification();
                   break;
            default:
                   notify=new Notification();
                   break;
        }
        notify.NotifyUser();
        sc.close(); 

    }
    
}
