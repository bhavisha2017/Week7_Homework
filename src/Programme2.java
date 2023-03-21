/* Write a java program to input any year like (ex.2007) and find out if it is leap year or
 *not?
 */

import java.util.Scanner;

public class Programme2 {

    public static void main(String[] args) {
        Programme2 obj = new Programme2();//object creation
        obj.myMethod();
    }

    public void myMethod() {//instance method

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        int year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }


}