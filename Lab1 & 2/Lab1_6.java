import java.util.Scanner;

public class Lab1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        System.out.println("how much power");
        int power = sc.nextInt();
        int ans = 1;
        int i = 0;
        for (i = 1; i < power; i++) {
            ans *= number;
        }
        System.out.println(ans);
    }
}
