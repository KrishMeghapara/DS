import java.util.Scanner;

public class Lab4_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int arr[] = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {

            int b = sc.nextInt();
            arr[i] = b;

        }
        System.out.println("Enter index location");
        int location = sc.nextInt();
        int arr2[] = new int[lengthOfArray - 1];
        for (int i = 0; i < location; i++) {
            arr2[i] = arr[i];
        }
        for (int i = location + 1; i < lengthOfArray; i++) {
            arr2[i - 1] = arr[i];
        }
        for (int i = 0; i < lengthOfArray - 1; i++) {
            System.out.println(arr2[i]);
        }

    }

}