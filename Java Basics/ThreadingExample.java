

class A{

    public void show(){
        for (int i = 0; i <= 50; i++) {
            System.out.println("Hello");
        }
    }

}


class B{

    public void show(){
        for (int i = 0; i <= 50; i++) {
            System.out.println("Hi");
        }
    }

}


public class ThreadingExample {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
    
}
