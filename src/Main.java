import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dec_num, quot, i = 1, j;
        int b_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        quot = dec_num;
        while (quot != 0) {


            b_num[(i++)-1] = quot % 2;

            quot = quot / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i-2 ; j>-1; j--) {
            System.out.print(b_num[j]);

        }
        System.out.print("\n");
    }
}

