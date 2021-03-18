import java.util.Scanner;

public class Dectooct {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter decimal number to be converted to octal: ");
        int a = myObj.nextInt();
        int b = 0, c = 0, d = 0, e = 0;
        int oct[] = new int[50];
        System.out.print("The number " + a + " in octal is equals to: ");

        if (a < 8) {
            oct[d] = a;

        } else {
            while (a >= 8) {

                b = a / 8;
                c = a % 8;
                oct[d] = c;
                a = a / 8;
                d++;
                if (b < 8) {
                    oct[d] = b;

                }

            }
        }

        for (int i = d; i >= 0; i--) {

            System.out.print(oct[i]);
        }
    }
}
