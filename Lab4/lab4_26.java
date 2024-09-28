import java.util.Scanner;

public class lab4_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter no");
            a[i] = sc.nextInt();

        }
        int b[] = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.println("enter no");
            b[i] = sc.nextInt();

        }
        int c[] = new int[n + m];

        for (int i = 0; i < n; i++) {
            c[i] = a[i];

        }
        for (int j = 0; j < m; j++) {
            c[j + n] = b[j];
        }
        for (int i = 0; i < m + n; i++) {
            System.out.println(c[i] + " ");
        }

    }
}
