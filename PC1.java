public class PC1 {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        int z;
        if (x>y){
            if(y>0){
                z=x/y;
            }
            else{
                z=x*y;
            }
        }
        else{
            z=0;
        }
        System.out.println(z);
    }
}