import java.util.Scanner;

public class Lab3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be replaced: ");
        int numToReplace = scanner.nextInt();

        System.out.print("Enter the number to replace with: ");
        int replacementNum = scanner.nextInt();

        int replaceIndex = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] == numToReplace) {
                array[i] = replacementNum;
                replaceIndex = i;
                break;
            }
        }

        if (replaceIndex != -1) {
            ;
        } else {
            System.out.println(numToReplace + " not found in the array.");
        }

        System.out.println("Final array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
