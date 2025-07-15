class Animal{
    void eat(){
        System.out.println("Animal will Eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void meoww(){
        System.out.println("Cat meoww");
    }
}
public class Hiearchial{
    public static void main(String[] args) {
        System.out.println("----------------The Dog Details-------------------");
        Dog d=new Dog();
        d.eat();
        d.bark();
        System.out.println("----------------The Cat Details-------------------");
        Cat c=new Cat();
        c.eat();
        c.meoww();
        
    }
    
}
