/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
* using switch statement.
*/
import java.util.Scanner;
public class Programme9 {

    public void myMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet from 'A' to 'F' ");
        char myMethod = sc.next().charAt(0);
        String alpha;


        switch (Character.toUpperCase(myMethod)) {
            case 'A':
                System.out.println("city name is Ahmedabad");
                break;
            case 'B':
                System.out.println("city name is birmingham");
                break;
            case 'C':
                System.out.println("city name is coventry");
                break;
            case 'D':
                System.out.println("city name is derby");
                break;
            case 'E':
                System.out.println("city name is edinburgh");
                break;
            case 'F':
                System.out.println("city name is faridabad");
                break;
            default:
                System.out.println("invalid entry");

                sc.close();

        }
    }

    public static void main(String[] args) {
        Programme9 t = new Programme9();
        t.myMethod();
    }
}