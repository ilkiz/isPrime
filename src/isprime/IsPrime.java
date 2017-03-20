
package isprime;

/**
 *
 * @author ilkiz
 */
public class IsPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
               count++; 
            }
        }
        System.out.println("Number of prime numbers less than 10000: "+count);
    }
    public static boolean isPrime(int number){
        for (int j = 2; j < number; j++) {
            if (number%j==0) {
                return false;
            }
        }
        return true;

    }
    
    
}
