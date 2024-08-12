import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char :");
        char a = sc.next().charAt(0);
        if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o'
                || a == 'u') {
            System.out.println("char is vowel");

        } else {
            System.out.println("char is not a vowel");
        }
    }
}
