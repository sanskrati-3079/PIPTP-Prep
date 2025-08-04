
public class PC16 {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }

    // Recursive function to calculate power
    public static int power(int x, int y) {
        if (y == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        return x * power(x, y - 1); // Recursive case
    }
}
