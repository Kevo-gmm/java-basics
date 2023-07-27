import java.util.Scanner;

/**
 * Compute class
 */
class Compute {
    private final double RATE = 5;

    /**
     * This function only returns the interest
     */
    double compoundHandler(double p, double t) {
        double interest = p * (Math.pow((1 + (RATE / 100)), t) - 1);
        return interest;
    }

}

/**
 * Compound Interest Generator
 */
public class CompoundInterest {

    public static void main(String[] args) {
        Compute comp = new Compute();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal amount here: ");
            double p = sc.nextDouble();
            System.out.println("Enter the time you would like to check Compound interest for:");
            double t = sc.nextDouble();
            System.out.println("The interest amount is :");
            double interest = comp.compoundHandler(p, t);
            System.out.println(interest);
            System.out.println("The total amount is:");
            System.out.println(interest + p);
        } catch (Exception e) {
            // handle exception
            System.out.println("An error occured");
            System.out.println(e);
        }

    }
}