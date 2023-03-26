import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, t;
        System.out.println("enter two number");
        a = sc.nextInt();
        b = sc.nextInt();
        int aa = a;
        int bb = b;
        while (bb != 0) {
            t = bb;
            bb = aa % bb;
            aa = t;
        }
        int gcd = aa;
        int lcm = (a * b) / gcd;
        System.out.println("lcm is " + lcm);
        System.out.println("gcd is " + gcd);

    }
}
