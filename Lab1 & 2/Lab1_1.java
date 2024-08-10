import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Redius");
        double redius = sc.nextDouble();
        double ans = Math.PI * redius * redius;
        System.out.println(ans);
    }
}
