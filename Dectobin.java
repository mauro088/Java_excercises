import java.util.Scanner;

public class Dectobin {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter decimal number to be converted to binary: ");
        int a = myObj.nextInt();
        int b = 0, c = 0, d = 0, e = 0;
        int oct[] = new int[50];
        System.out.print("The number " + a + " in binary is equals to: ");

        if (a < 2) {
            oct[d] = a;

        } else {
            while (a >= 2) {

                b = a / 2;
                c = a % 2;
                oct[d] = c;
                a = a / 2;
                d++;
                if (b < 2) {
                    oct[d] = b;

                }

            }
        }

        for (int i = d; i >= 0; i--) {

            System.out.print(oct[i]);
        }
    }
}
