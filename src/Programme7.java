import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Programme7 {

    public static void sales() {//static method

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales ID");
        int id = sc.nextInt();
        System.out.print("Enter seller's name");
        String name = sc.next();
        System.out.print("Enter sales amount");
        int salesAmount = sc.nextInt();
        System.out.print("Enter salary basic");
        int salary = sc.nextInt();

        double commissionRate = 0;
        double salesCommission;
        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else if (salesAmount < 10000) {
            commissionRate = 0.02;
        }
        salesCommission = commissionRate * salesAmount;
        System.out.println("The Commission is: " + salesCommission);
        sc.close();
    }

    public static void main(String[] args) {
        sales();//method calling
    }
}
