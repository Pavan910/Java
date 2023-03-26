import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int m = 0, count = 0, p = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        // count = (int) Math.log10(n) + 1;
        temp = n;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        temp = n;
        while (temp != 0) {
            m = temp % 10;
            p += (Math.pow(m, count));
            temp /= 10;
        }
        if (p == n) {
            System.out.println("the number is armstrong");
        } else {
            System.out.println("the number is not armstrong");
        }

    }
}
