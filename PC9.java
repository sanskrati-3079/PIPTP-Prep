public class PC9 {
    public static int call(int x) {
        return x + 2;
    }

    public static void main(String[] args) {
        int result = call(call(call(0)));
        System.out.println(result);
    }
}
// Output: 6
