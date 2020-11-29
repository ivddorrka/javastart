package randomfun;

public class Les32 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        boolean d = a >= b;
        boolean w = b >= a;
        boolean x = w || d;
        boolean answer = a<b & a!=b;
        System.out.println(x);
        System.out.print(answer);
    }
}