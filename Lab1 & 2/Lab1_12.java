
import java.util.Scanner;

public class Lab1_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, a, b, c, sum = 0;
        System.out.println("Armstron number from 1 to 1000:");
        for (int i = 1; i < 1000; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
            sum = 0;
        }
    }
}
