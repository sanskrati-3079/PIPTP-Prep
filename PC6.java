public class PC6 {
    public static int f(int a) {
        if (a == 1) return 1;
        return a + f(a - 1);
    }

    public static void main(String[] args) {
        int x = f(3);
        System.out.println(x);
    }
}
// Output: 6

