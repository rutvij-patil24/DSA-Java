
interface Computer{

    // An interface only has public abstract methods
    void compiler(); 
    // This is same as writing public abstract void compiler();

    int price = 3000;
    // Variables are by default public static in an interface

    // We can define a method in an interface using the 'default' keyword
    // This feature was introduced in Java8

    default void funcDefinition(){
        System.out.println("Function Definition possible using \"Default\" keyword");
    }

}

interface Portable{

    void move();
}

class Desktop implements Computer{

    
    public void compiler(){
        System.out.println("Compiling Faster...");
    }
}

class Laptop implements Computer, Portable{

    public void compiler(){
        System.out.println("Compiling...");
    }
    // If we write only this compiler method, it will give the following error:
    // The type Laptop must implement the inherited abstract method Portable.move()
    // Hence, we have to ovveride the move method

    public void move(){
        System.out.println("Laptop is portable!");
    }

}


class Developer{
    public void Code(Computer c){
        System.out.println("Coding...");
        c.compiler();  
    }
}



public class interfaceExample {
    public static void main(String[] args) {
        
        Computer lap1 = new Laptop();

        Computer desk1 = new Desktop();

        Developer dev1 = new Developer();

        dev1.Code(lap1);
        dev1.Code(desk1);

        System.out.println("Computer price is: " + Computer.price);
        lap1.funcDefinition();
    }
}
