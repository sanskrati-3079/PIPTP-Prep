public class PC3{
    public static int foo(int x) {
        if (x == 0) return 1;
        return x * foo(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(foo(4));
    }
}
// Output: 24