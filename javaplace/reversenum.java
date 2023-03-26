import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rem, rev = 0;
        System.out.println("enter the number.");
        n = sc.nextInt();
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("rever number is:" + rev);
    }
}
