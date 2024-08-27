import java.util.Scanner;

public class Lab3_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int a[] = new int[lengthOfArray];
        if (lengthOfArray == 1) {
            System.out.println("Does not have duplicate value");
        }
        int maxIndex = 0;
        int smallIndex = 0;
        int equalIndex = 0;
        for (int i = 0; i < lengthOfArray; i++) {

            int b = sc.nextInt();
            a[i] = b;

        }
        int equalNumber = a[0];
        for (int i = 0; i < lengthOfArray; i++) {
            if (a[i] == equalNumber) {
                equalNumber = a[i];
                equalIndex = 1;

            }
        }
        if (equalIndex == 1) {
            System.out.println("Array Cointain duplicate number ");
        } else {
            System.out.println("Does not have duplicate number");
        }
    }
}
