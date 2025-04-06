package OOP;

public abstract class Subject {

    Subject(){
        System.out.println("Inside Abstraction Constructor");
    }

    abstract void syllabus();

    public static void learn(){
        System.out.println("Inside Abstraction Learn Method");
    }
    
}


