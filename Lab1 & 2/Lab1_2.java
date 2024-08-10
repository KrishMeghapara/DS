import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("number if odd");
        }
    }
}
