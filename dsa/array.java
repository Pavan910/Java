import java.util.*;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter alues of the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}