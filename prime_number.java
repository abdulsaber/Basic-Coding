public class prime_number {
    public static void main(String[] args) {
        
        int n=10;
        for(int i=1;i<n;i++){
            isprime(i);
        }

    }
    public static void isprime(int n) {
        int count = 0;
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                count++;
            }
        }
            if (count == 0) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }


        }
    }

        
    
    

