/* 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
*/


import java.util.Scanner;

public class Programme16 {

        public void myMethod()
        {
            int num;
            //Scanner class to read value
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter any integer number: ");
            num=sc.nextInt();

            //check condition for +ve, -ve and Zero
            if(num>0)
                System.out.println(num + " is POSITIVE NUMBER.");
            else if(num<0)
                System.out.println(num + " is NEGATIVE NUMBER.");
            else
                System.out.println("IT's ZERO.");
            sc.close();
        }

    public static void main(String[] args) {
        Programme16 t = new Programme16();
        t.myMethod();
    }
    }


