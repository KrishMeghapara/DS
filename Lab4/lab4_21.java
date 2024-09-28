import java.util.Scanner;

class lab4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int arr[] = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {

            int b = sc.nextInt();
            arr[i] = b;

        }
        System.out.println("Enter index loca tion");
        int location = sc.nextInt();
        System.out.println("Enter the element do you want to insert");
        int element = sc.nextInt();
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