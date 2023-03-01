import java.util.Scanner;

public class Main_OOP {

    // Class attribute
    int num = 13;
    int num2;

    enum Level{
        LOW, 
        MEDIUM, 
        HIGH
    }

    // Class constructor
    // Called when an object of a class is created - used to initialised objects
    // Can also take in parameters
    public Main_OOP(){
        num2 = 13;
    }

    static void myMethod(){
        System.out.println("BTS for life");
    }

    public void myMethod2(){
        System.out.println("BTS for life");
    }
    
    // Use the keyword new to create new object
    public static void main(String[] args){
        Main_OOP myObj1 = new Main_OOP();
        System.out.println("Before change: num = " + myObj1.num);

        //Modify attribute value
        myObj1.num = 7;
        System.out.println("After change: num = " + myObj1.num);

        // If don't want the ability to override the existing values, declare as final
        
        // Call myMethod
        myMethod();

        // Static VS Public
        // Static methods can be called without creating objects
        // Public methods must be called by creating objects
        myMethod();
        // myMethod2(); // This would compile an error

        myObj1.myMethod2();

        /* Encapsulation
        1. Better control of class attributes and methods
        2. Class attributes can be made read-only or write-only
        3. Flexible: One part of codes can be changed without affecting others
        4. Security */ 
        Person myPerson = new Person();
        myPerson.setName("Park Jimin");
        System.out.println(myPerson.getName());

        Level myEnum= Level.HIGH;
        System.out.println(myEnum);

        // User input
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter username: ");
        // Read user input (nextLine for String)
        String userName = myInput.nextLine();
        System.out.println("Username: " + userName);

        // nextBoolean()
        // nextInt()
        // nextDouble()...

    }
}
