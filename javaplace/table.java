import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int s = n * i;
            System.out.println(+n + "x" + i + "=" + s);
        }
    }
}
