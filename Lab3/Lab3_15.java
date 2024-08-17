import java.util.Scanner;

public class Lab3_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        System.out.println("Enter M");
        m = sc.nextInt();
        System.out.println("Enter N");
        n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
