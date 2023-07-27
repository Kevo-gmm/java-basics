import java.util.Scanner;

/**
 * Compute
 */
class Compute {
    private final double RATE = 10;

    double interestHandler(double p, double t) {
        double interest = (RATE / 100) * p * t;
        return interest;

    }

}

/**
 * SimpleInterest
 */
public class SimpleInterest {

    public static void main(String[] args) {
        Compute comp = new Compute();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount here: ");
            double p = sc.nextDouble();
            System.out.println("Enter the time you would like to check the principal amount for:");
            double t = sc.nextDouble();
            System.out.println("The interest amount is :");
            double interest=comp.interestHandler(p, t);
            System.out.println(interest);
            System.out.println("The total amount is:");
            System.out.println(interest+p);


        } catch (Exception e) {
            // : handle exception
            System.out.println("An error occured");
            System.out.println(e);

        }
    }
}