import java.util.Scanner;

public class sumdidgit {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        while (n != 0) {
            int k = n % 10;
            sum += k;
            n /= 10;
        }
        if (n % sum == 0) {
            System.out.println("yes the number is divisble by the sum of its digit");
        } else {
            System.out.println("No the number is not divisble by the sum of its digit");
        }
    }
}
