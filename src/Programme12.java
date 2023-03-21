//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;


public class Programme12 {

    public void myMethod() {//instance method

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any value : ");
        char value = scanner.next().charAt(0);

        if (value >= '0' && value <= '9') {

            System.out.println(value + " is a number.");


        } else if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {

            System.out.println(value + " is an ALPHABET.");


        } else {

            System.out.println(value + " is a Symbol.");
            int symbol = scanner.nextInt();
        }

        scanner.close();

    }

    public static void main(String[] args) {
        Programme12 t = new Programme12();
        t.myMethod();
    }
}