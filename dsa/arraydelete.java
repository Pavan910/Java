import java.util.Scanner;

public class arraydelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("enter the number of values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter 1 number to delete:");
        int m = sc.nextInt();
        System.out.println("enter 2 number to delete:");
        int p = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m || i == p) {
                continue;
            } else {
                b[i - 1] = a[i];
            }
        }
        System.out.println("the values are:");
        for (int i = 0; i < n - 2; i++) {
            System.out.println(b[i]);
        }
    }
}
