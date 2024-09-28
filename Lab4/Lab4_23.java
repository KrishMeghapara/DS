
import java.util.Scanner;

public class Lab4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int arr[] = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {

            int b = sc.nextInt();
            arr[i] = b;

        }

        System.out.println("Enter the element do you want to insert");
        int element = sc.nextInt();
        int location = 0;
        for (int i = 1; i < lengthOfArray; i++) {

            if (element > arr[i - 1] && element < arr[i]) {
                location = i;
                break;
            } else if (element > arr[i]) {
                location = i + 1;
            }

        }

        int arr2[] = new int[lengthOfArray + 1];
        for (int i = 0; i < location; i++) {
            arr2[i] = arr[i];
        }
        arr2[location] = element;
        for (int i = location + 1; i < lengthOfArray + 1; i++) {
            arr2[i] = arr[i - 1];
        }
        for (int i = 0; i < lengthOfArray + 1; i++) {
            System.out.println(arr2[i]);
        }

    }

}
