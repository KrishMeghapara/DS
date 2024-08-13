import java.util.Scanner;

public class Lab1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int i = 0;
        for (i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }

        }
    }
}
