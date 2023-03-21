import java.util.Scanner;

/**
 *10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {

    public void myMethod() {//instance method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:  ");
        int first = sc.nextInt();
        System.out.println("Enter second number:  ");
        int second = sc.nextInt();
        System.out.println("Enter any symbol from: +,-,/,*");
        char symbol = sc.next().charAt(0);


        int addition = first + second;
        int substraction = first - second;
        int multiply = first * second;
        double division = first / second;

        if (symbol == '+') {
            System.out.println("Sum = " + addition);
        } else if (symbol == '-') {
            System.out.println("Difference =" + substraction);
        } else if (symbol == '*') {
            System.out.println("Multiplication =" + multiply);
        } else if (symbol == '/') {
            System.out.println("division =" + division);
        }
         sc.close();

    }

    public static void main(String[] args) {
        Programme10 t = new Programme10();
        t.myMethod();
    }
    }

