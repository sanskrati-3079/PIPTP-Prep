public class PC8 {
    public static int process(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = process(process(x));
        System.out.println(y);
    }
}
// Output: 12
