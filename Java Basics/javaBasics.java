// Basic rule - className should be the same as fileName

// To run a java file, enter the following commands on the terminal:
// javac fileName.java (to compile)
// java fileName (to run)


class javaBasics{
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        // Primitive datatypes
        int num = 5;
        double d = 6.9;
        float f = 4.5f;
        long l = 45678;
        char c = 'R';

        System.out.println(num + d);
        System.out.println(num + " " + d); // Concatenation

        show(); 
        // You don't need to create an object for
        // accessing this method since it is 'static'


        // Operators
        int num1 = 10;
        int num2 = 5;
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;

        boolean result6 = num1 > num2;
        boolean result7 = num1 >= num2;
        boolean result8 = num1 < num2;
        boolean result9 = num1 <= num2;
        boolean result10 = num1 == num2;
        boolean result11 = num1 != num2;

        boolean result12 = num1 > num2 && num2 != 0;
        boolean result13 = num1 <= num2 || num1 == 0;
        boolean result14 = !(num1 > 0);

        int num3 = 4;
        int num4 = 5;
        int num5 = 0;

        // if / else if / else
        if(num3 % 2 == 0)
            System.out.println("Even Number");
        else if(num3 %2 != 0)
            System.out.println("Odd Number");
        else
            System.out.println("Number is neither Odd nor Even");

        // Ternary operator
        String result15 = num3 > num4 ? "Num3 Greater" : "Num4 Greater";
        System.out.println(result15);

        // Switch
        int num6 = 1;

        switch(num6){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Neither case");
        }

        // Loops - for / while / do while

        int i = 0;
        while (i<4) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k<10);


        // These were all the Java fundamentals
        // See you in the next step, which is
        // OOP (Object Oriented Programming) in Java

    }

    public static void show(){
        System.out.println("Show Method"); 
    }

}