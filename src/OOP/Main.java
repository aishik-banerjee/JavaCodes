package OOP;

public class Main {

    public static void main(String[] args) {
        
        /*Bicycle bicycle=new Bicycle();
        bicycle.applybrake(5);
        bicycle.changeGear(2);
        bicycle.speedUp(30);

        System.out.println("Present State of Bicycle");
        bicycle.printStates();

        Bike bike=new Bike();
        bike.applybrake(5);
        bike.changeGear(2);
        bike.speedUp(30);

        System.out.println("Present State of Bike");
        bike.printStates();*/

        /*Employee emp=new Employee();
        emp.setAge(27);
        emp.setName("Aishik Banerjee");

        System.out.println("My name is "+ emp.getName()+" and I am "+ emp.getAge()+" years old");*/

        Parent parent=new Parent("Amit");
        Child child=new Child("Amit","Aishik");
        Parent parchild=new Child("Amit", "Aishik");

        System.out.println("Parent ==> ");
        parent.fun();
        parent.fun(10);

        System.out.println("Child ==> ");
        child.fun();
        child.fun(20);

        System.out.println("Dynamic Method Dispatch ==> ");
        parchild.fun();
        parchild.fun(30);

    }
    
}
