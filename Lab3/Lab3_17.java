import java.util.Scanner;

public class Lab3_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int a[] = new int[lengthOfArray];
        int maxIndex = 0;
        int smallIndex = 0;
        for (int i = 0; i < lengthOfArray; i++) {

            int b = sc.nextInt();
            a[i] = b;

        }

        int maxNumber = a[0];
        for (int i = 0; i < lengthOfArray; i++) {
            if (a[i] > maxNumber) {
                maxNumber = a[i];
                maxIndex = i;
            }
        }
        int smallNumber = a[0];
        for (int j = 0; j < lengthOfArray; j++) {
            if (a[j] < smallNumber) {
                smallNumber = a[j];
                smallIndex = j;
            }
        }
        System.out.println(maxIndex);
        System.out.println(smallIndex);
        System.out.println(maxNumber);
        System.out.println(smallNumber);
    }
}
