public class PrimeChecker {
    public static void main(String[] args) {
        int num = 29; // this is the number to test
        boolean isPrime = true;
        /*
        Insert your code here
        */
        for(int i = 2; i < num; i++){
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }        
}



