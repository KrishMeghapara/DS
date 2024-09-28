import java.util.Scanner;

public class Lab4_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int arr[] = new int[lengthOfArray];
        if (lengthOfArray == 1) {
            System.out.println(arr[0]);
        } else {
            int maxIndex = 0;
            int smallIndex = 0;
            int equalIndex = 0;
            for (int i = 0; i < lengthOfArray; i++) {

                int b = sc.nextInt();
                arr[i] = b;

            }
            int equalNumber = arr[0];
            int count = 0;
            int arr3[] = new int[lengthOfArray];
            for (int k = 0; k < lengthOfArray; k++) {
                equalNumber = arr[0];
                for (int i = 0; i < lengthOfArray; i++) {
                    if (arr[i] == equalNumber) {
                        equalNumber = arr[i];
                        count = 1;

                        int location = i;
                        for (int j = 0; j < count; j++) {
                            location = i;
                            location = arr3[j];
                            int arr2[] = new int[lengthOfArray - count];
                            for (int l = 0; l < location; l++) {
                                arr2[l] = arr[l];
                            }
                            for (int l = location + 1; l < lengthOfArray; l++) {
                                arr2[l - 1] = arr[l];
                            }
                            if (k == (lengthOfArray - 1)) {
                                for (int l = 0; l < arr2.length; l++) {
                                    System.out.println(arr2[l]);
                                }
                            }

                        }

                    }
                }
            }
            // System.out.println("yoo");
            // System.out.println(count);
            // for (int i = 0; i < count; i++) {
            // System.out.println(arr3[i]);
            // }
            // int location = 0;
            // for (int j = 0; j < count; j++) {
            // location = 0;
            // location = arr3[j];
            // int arr2[] = new int[lengthOfArray - count];
            // for (int i = 0; i < location; i++) {
            // arr2[i] = arr[i];
            // }
            // for (int i = location + 1; i < lengthOfArray; i++) {
            // arr2[i - 1] = arr[i];
            // }
            // if (j == (count - 1)) {
            // for (int i = 0; i < lengthOfArray - 1; i++) {
            // System.out.println(arr2[i]);
            // }
            // }

        }

    }

}
