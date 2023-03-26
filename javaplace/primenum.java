import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value");
        n = sc.nextInt();
        System.out.println("the prime between 1 to " + n + " are: ");
        for (int j = 2; j <= n; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + " ");

        }
    }
}
