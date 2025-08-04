public class PC7{
    public static void main(String[] args) {
        int n = 5; 
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        if (n <= 1) {
            return n;
        }
        return fun(n - 1) + fun(n - 3);
    }
}