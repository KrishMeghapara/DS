import java.util.Scanner;

public class Lab3_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter N");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        double avg = sum / n;
        System.out.println(avg);
    }
}
