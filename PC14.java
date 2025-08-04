public class PC14 {
    public static void main(String[] args) {
        System.out.println(productOfDigits(123)); // Output: 6
    }

    public static int productOfDigits(int n) {
        if (n == 0) {
            return 1; // Base case: product of digits of 0 is defined as 1
        }
        return (n % 10) * productOfDigits(n / 10); // Recursive case
    }
}

