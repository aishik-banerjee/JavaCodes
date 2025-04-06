package OOP;

public class Parent {

    String ParentName;

    Parent(String name){
        System.out.println("Inside Parent Constructor");
        this.ParentName=name;
    }

    public void fun(){
        System.out.println("Inside Parent fun");
    }

    public void fun(int a){
        System.out.println("Inside Parent fun " + a);
    }
    
}
