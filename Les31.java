package randomfun;

public class Les31 {
    public static void main(String[] args) {
        double a = 5, b =15;
        double c = a%b;
        int w = 5;
        int y = 3;
        int z = w - y++;
        double answer = ++a - --a - a-- + a++;
        answer += 3;
        answer /= 3;
        ++answer;
        w = y = z = 18;
        
        System.out.println(w);
        System.out.println(y);
        System.out.println(z);

        
    }
    
}
