package recursiongoodluck;

public class RecursionGOODLUCK {

    public static int Summation(int n) {
        // Base Case
        if (n<=0) {
            return 0;
        }
        // Recursive Case
        else {
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n) {
        if (n<=1) {
            return 1;
        }
        else {
            return n * Factorial(n-1);
        }
    }

    // 5^3 = 5*5*5
    public static int Exponentiation (int n, int p) {
        // Base case
        if (p<=0) {
            return 1;
        } else {
            return n * Exponentiation(n, p-1);
        }
    }

    public static void main (String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(3, 4));
    }
}
