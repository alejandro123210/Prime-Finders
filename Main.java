import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main (String[] args){
        //list of all the primes
        List<Double> primes = new ArrayList<Double>();
        //up to what number we want to check
        Double max = 1000.0;
        //beginning loop, this is the number that will be checked
        for(double i=1;i<max;i+=2){
            //the code assumes that the number is a prime number
            boolean isPrime = true;
            //this checks if the number is prime, it only needs to check up to the square root
            //also, it only checks odd numbers because any even number times any int is also even, meaning it can be divided by 2
            for(int x=3;x<=Math.sqrt(i);x+=2){
                //if the remainder of any equation is 0, the number can't be prime
                if(i%x==0){
                    isPrime = false;
                }
            }
            //adds the prime number to the array of primes
            if(isPrime == true){
                primes.add(i);
            }
        }
        //adds 2 because the code can't account for it
        primes.add(1, 2.0);
        //prints the data
        System.out.println(primes);
        System.out.println("There are " + primes.size() + " prime numbers from 1 to " + max);
        Double percentageDouble = primes.size() / max;
        System.out.println("that's " + percentageDouble + "%!");
    }
}
