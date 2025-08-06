public class PC2 {
    public static int square(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        int res = square(square(2));
        System.out.println(res);
    }
}
// Output: 16