import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        double s = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values to add");
        int n = sc.nextInt();
        for (double i = 1; i <= n; i++) {
            s = s + 1 / i;
        }
        System.out.println("the toal sum is:" + s);

    }
}