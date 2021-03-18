import java.util.Scanner;

public class Bintodec {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("type binary number to be converted to decimal : ");
        String num = myObj.nextLine();

        int a = 0, b = 0;
        double c = 0, d = 0, f = 0, g = 0;
        b = num.length();
        String[] items = num.split("");

        int[] bin = new int[b];
        double[] suma = new double[b];

        for (int i = b - 1; i >= 0; i--) {
            bin[i] = Integer.parseInt(items[i]);
            // System.out.println(bin[i]);

        }
        int cont = 0;
        double acum = 0;
        for (int e = b - 1; e >= 0; e--) {

            c = bin[e];
            d = Math.pow(2, cont);
            f = c * d;
            g = f;
            cont++;

            acum = acum + f;
        }
        System.out.print("The number " + num + " is equals to " + acum + " in decimal. ");

    }
}
