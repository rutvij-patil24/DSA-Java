import java.util.Arrays;

class Student{
    int rollNo;
    String name;

    // To make constructor, shortcut is 
    // right click --> Source Action --> Generate Constructors
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("Student Name: " + name + "\nRoll Number: " + rollNo);
    }

    @Override
    public String toString() {
        return "Student [rollNo: " + rollNo + ", Name: " + name + "]";
    }
}



public class arraysAndStrings {
    public static void main(String[] args) {
        
        String s1 = "Rutvij";
        // Actually behind the scenes it is
        // String s1 = new String("Rutvij");
        // Strings are immutable in Java
        String s3 = "Rutvij";
        // Above line will not make a new variable,
        // It will point to the same address as s1
        // To make mutable String, you can use StringBuffer

        StringBuffer s2 = new StringBuffer("Hello");
        s2.append(" World");
        System.out.println(s2);


        // 2 ways to declare Arrays
        int nums[] = {6,8,3,2};

        int nums1[] = new int[5];

        // For Each loop
        for (int i : nums) {
            System.out.println(i);
        }

        int j = 8;
        for (int i = 0; i < nums1.length; i++,j++) {
            nums1[i] = j;
        }
        System.out.println(Arrays.toString(nums1));


        // Lets print an object now!
        // Student s = new Student(24, "Rutvij Patil");
        // s.displayDetails();
        // // Below line will print address of the object
        // System.out.println(s);

        // Now lets create an array of Student objects

        Student students[] = new Student[3];
        students[0] = new Student(24, "Rutvij");
        students[1] = new Student(38, "Abhijeet");
        students[2] = new Student(56, "Nishank");

        for (Student s : students) {
            System.out.println(s);            
        }
    }
}
