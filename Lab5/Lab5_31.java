
import java.util.Scanner;;

class Lab5_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][2];
        int b[][] = new int[2][3];
        int c[][] = new int[3][3];
        System.out.println("Enter 1 st arr");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter 2 st arr");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();

            }
        }

        for (int j = 0; j < 3; j++) {
            int y = 0;
            for (int k = 0; k < 3; k++) {
                c[j][k] = a[j][0] * b[0][y] + a[j][1] * b[1][y];
                y++;
            }
        }
        System.out.println("Ans:::::");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "  | ");
            }
            System.out.println(" ");
        }
    }
}