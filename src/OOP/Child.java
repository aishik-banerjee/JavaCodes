package OOP;

public class Child extends Parent{

    String ChildName;

    Child(String pname, String cname){
        super(pname);
        System.out.println("Inside Child Constructor");
        this.ChildName=cname;
    }

    @Override
    public void fun(int a){
        System.out.println("Inside Child fun "+ a);
    }
    
}
