import java.util.Scanner;

public class arrayinsert {
    public static void main(String[] args) {
        int n, m, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements:");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the index:");
        m = sc.nextInt();
        System.out.println("enter the value to insertion:");
        p = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = a[i - 1];
            }
        }
        System.out.println("the elements are:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }

    }
}
