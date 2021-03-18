import java.util.Scanner;

public class Octtodec {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Imput octal number to be converted to decimal:");
        String num = myObj.nextLine();

        int l = num.length();

        double f = 0, a = 0;

        for (int i = l - 1; i >= 0; i--) {

            char result = num.charAt(i);
            double d = (double) (result - '0');

            if (d <= 7) {

                double r = d * (Math.pow(8, a));

                f = f + r;
                a++;
            } else {

                System.out.println("The number should be expressed in octal base!!");

            }

        }

        System.out.println("The number :" + num + " is equals to : " + f);

    }
}
