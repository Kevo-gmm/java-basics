import java.util.Scanner;

/**
  * InnerAverage
  */
 class Compute {
 double findAverage(double a, double b,double c){
    return (a+b+c)/3;
 }
    
 }
/**
 * Average
 */
public class Average {

    public static void main(String[] args) {
        Compute comp=new Compute();
        try (Scanner sc= new Scanner(System.in)) {    
          
            System.out.println("Enter the first number :");
              double a=sc.nextDouble();
            System.out.println("Enter the second number :");
              double b=sc.nextDouble();
            System.out.println("Enter the last number :");
              double c=sc.nextDouble();
              double average=comp.findAverage(a, b, c);
              System.out.println("The Average is:");
              System.out.println(average);

        } catch (Exception e) {
            // handle exception
            System.out.println("An error occurred");
        }
    }
}