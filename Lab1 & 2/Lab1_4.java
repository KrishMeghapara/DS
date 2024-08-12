import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int sum = 1;
        int i = 0;
        for (i = 1; i <= number; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
