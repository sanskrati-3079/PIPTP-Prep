public class PC15 {
    public static void main(String[] args) {
        f(8);
    }

    public static void f(int x) {
        if (x < 1) {
            return;
        }
        f(x / 2);
        System.out.println(x);
    }
}