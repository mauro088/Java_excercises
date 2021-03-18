import java.util.Scanner;

public class Bintooct {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Imput binary number to be converted to octal base : ");

        String num = myObj.nextLine(), sub = "";

        int l = num.length(), mod = l % 3, div = l / 3, arr = 0, a = 0, b = 0, i = 0;
        double test = 0;

        if (mod == 0) {
            arr = div;
            b = a + 3;
        } else {
            arr = div + 1;
            b = mod;
        }

        int oct[] = new int[arr];

        // System.out.println(l);
        // System.out.println(arr);

        System.out.print("The binary number " + num + " is equals to: ");

        while (b <= l) {

            sub = num.substring(a, b);
            double dnum = Double.parseDouble(sub);

            test = ((dnum % 10) * 1) + (((dnum % 100) / 10) * 2 + ((dnum / 100) * 4));
            int value = (int) test;
            oct[i] = value;

            System.out.print(oct[i]);

            a = b;
            b = a + 3;
            i++;

        }

        System.out.print(" in octal base. ");

    }
}
