import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        int i, a[], temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("the elements are:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 1; i <= n - 1; i++) {
            temp = a[i];
            int j = i - 1;
            while (temp < a[j] && j >= 0) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }

        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
