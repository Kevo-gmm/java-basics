import java.util.*;

/**
 * InnerApp_1
 * defines all the computational methods
 */

interface InnerApp_1 {
    int subtract(int a, int b);

    int add(int a, int b);

    int multiplication(int a);
}

/**
 * InnerApp_1
 * defines a display function that prints hello world and extends InnerApp_1
 * interface
 */
interface InnerApp_2 extends InnerApp_1 {
    void display(int a);

}



 abstract class InnerApp_3 {
 abstract void displayAbstract();   
 }

/**
 * InnerApp class that implements the InnerApp_2 interface
 */
class InnerApp extends InnerApp_3 implements InnerApp_2 {
    private int value = 22;

    void displayAbstract(){
        System.out.println("Abstract method here");
    }

    static void oneTwo() // static block
    {
        System.out.println("Static block");
    }
    

    public void display(int a) {
        switch (a) {
            case 1:
                System.out.println("It's a one!");
                break;
            case 2:
                System.out.println("It's a 2");
            default:
                System.out.println("Hello, World!");
                break;
        }
        // DO WHILE LOOP
        do {
            System.out.println(a);
            a++;

        } while (a < 5);
    }

    public int add(int a, int b) {
        System.out.println("adds 2 numbers by adding them");
        return a + b;
    }

    public int subtract(int a, int b) {
        System.out.println("Subtract 2 numbers");
        int c = b;
        return c - a;
    }

    /**
     * this is a function that receives an interger number and multiplies that
     * number by 22
     */
    public int multiplication(int a) {
        System.out.println("Multiplication");
        return value * a;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Static method");
        InnerApp.oneTwo();
        InnerApp test = new InnerApp();
        test.displayAbstract();
        test.display(1);
        int sum = test.add(10, 20);
        System.out.println(sum);
        int sub = test.subtract(10, 20);
        System.out.println(sub);
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();
            int multiplication = test.multiplication(value);
            System.out.println(multiplication);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}