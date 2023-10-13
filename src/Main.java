public class Main {
    public static void main(String[] args) {

        System.out.println("Modification branche ");

    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }


    public double average(int[] array) {
        int sum = sum(array);
        return (double) sum / array.length;
    }
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public boolean isEven(int n) {
        return n % 2 == 0;
    }





}



