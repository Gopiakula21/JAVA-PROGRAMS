import java.util.*;
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;//Name=name;
        this.age=age;//Age=age
    }
    void display(){
        System.out.println("Name of the student: "+name);//Name
        System.out.println("Age of the student: "+age);//Age
    }
}
public class constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int num=sc.nextInt();
        Student obj=new Student(str1,num);
        obj.display();
        
    }
    
}
