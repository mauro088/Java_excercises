import java.util.Scanner;

public class Dectohex {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type number to conver to hexadecimal :");
        int num = myObj.nextInt();
        int a = num, b = 1, c = 0, d = 0, e = 0;

        int hex[] = new int[50];

        if (a <= 9) {

            System.out.print(a);

        } else

        {

            switch (a) {
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
                System.out.print("E");
                break;
            case 15:
                System.out.print("f");
                break;
            }

        }
        while (a >= 16) {

            c = a / 16;
            d = a % 16;
            hex[e] = d;
            a = a / 16;

            e++;

            if (a < 16) {
                hex[e] = a;
                for (int i = e; i >= 0; i--) {

                    switch (hex[i]) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("f");
                        break;
                    default:
                        System.out.print(hex[i]);
                    }

                }

            }

        }

    }
}
