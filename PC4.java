public class PC4{
    public static void main(String[] args) {
        int x = 3;
        fun(x);
    }

    public static void fun(int x) {
        if (x == 0) {
            return;
        }
        fun(x - 1);
        System.out.println(x);
    }
}

