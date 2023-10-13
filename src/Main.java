public class Main {
    public static void main (String [] args){

    }
    public boolean isEven(int n) {
        return n % 2 == 0;
    }
    public boolean isNotEven(int n) {
        return n % 2 != 0;
    }
    public String test () {return  "test";}
    public String test2 () {return  "test2";}
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
