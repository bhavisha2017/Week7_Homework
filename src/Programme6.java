/*6. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme6 {

// instance method

    public void oddEven(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter any numeric number to know if it's even or odd: ");
        int num = scan.nextInt();
        if (num%2==0){
            System.out.println(num +" is Even number");
        } else System.out.println(num + " Is Odd number");
    }

    public static void main(String[] args) { // Main method
        Programme6 obj = new Programme6();  // obj created
        obj.oddEven();
    }
}

