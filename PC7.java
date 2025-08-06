public class PC7 {
    public static int mystery(int x) {
        if (x == 0) return 1;
        return 2 * mystery(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(mystery(4));
    }
}
// Output: 16

