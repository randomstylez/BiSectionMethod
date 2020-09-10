package bisection.method;

/**
 *
 * @author Joey
 */

public class BiSectionMethod {
static final float EPSILON = (float)0.0001;

        static double func(double x)
        {
           return x*x*x -5*x*x + 2*x;
        }
        
        static void bisection(double a, double b)
        {
            if(func(a) * func(b) >= 0)
            {
                System.out.println("Check functions");
                return;
            }
            
            double c = a; 
            while ((b-a) >= EPSILON) 
        { 
            // Find middle point 
            c = (a+b)/2; 
  
            // Check if middle point is root 
            if (func(c) == 0.0) 
                break; 
  
            // Decide the side to repeat the steps 
            else if (func(c)*func(a) < 0) 
                b = c; 
            else
                a = c; 
        } 
                //prints value of c upto 4 decimal places 
        System.out.printf("The value of root is : %.4f"
                        ,c); 
    } 
  
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
        // Initial values assumed 
        double a =-200, b = 300; 
        bisection(a, b); 
    } 

} 
