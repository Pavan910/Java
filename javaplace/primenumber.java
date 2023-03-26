import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        System.out.println("enter the value");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("yes it is a prime number");
        } else {
            System.out.println("it is not a prime number.");
        }
    }
}
