import java.util.Scanner;

public class Lab1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int i;
        for (i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("this no. is not prime");
                break;
            }
        }
        if (a % i != 0) {
            System.out.println("this is prime no.");
        }
    }
}
