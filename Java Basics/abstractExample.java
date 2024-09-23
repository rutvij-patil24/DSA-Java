
abstract class Computer{

    public abstract void compiler();

    // 2 rules:
    // If a method is abstract, then class MUST be abstract
    // If a class is abstract, then its methods MAY or MAY NOT be abstract

    public void printSomething(){
        System.out.println("Hello World!");
    }
}



class Desktop extends Computer{

    // Child class MUST have the abstract method of the parent class
    public void compiler(){
        System.out.println("Compiling Faster...");
    }
}

class Laptop extends Computer{

    public void compiler(){
        System.out.println("Compiling...");
    }
}


class Developer{
    public void Code(Computer c){
        System.out.println("Coding...");
        c.compiler();  
    }
}



public class abstractExample {
    public static void main(String[] args) {
        
        Computer lap1 = new Laptop();

        // Computer c = new Computer(); 
        // Above line will give error

        Computer desk1 = new Desktop();

        Developer dev1 = new Developer();

        dev1.Code(lap1);
        lap1.printSomething();

        dev1.Code(desk1);        
        desk1.printSomething();
    }
}
