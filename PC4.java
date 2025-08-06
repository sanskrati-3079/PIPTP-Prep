public class PC4{
    public static int f(int x) {
        return x + 1;
    }
    
    public static void main(String[] args) {
        int a = f(f(f(1)));
        System.out.println(a);
    }
}
// Output: 4