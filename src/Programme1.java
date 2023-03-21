/*Write a java program that tells us that Input number is odd or even?
 *HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
     Programme1 t = new Programme1();// object creation
     t.numberOddEven();//method calling
    }


    public void numberOddEven() {//instance method

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = reader.nextInt();
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
        reader.close();

    }
}

