// 18. Write a Java program to sum values of an array.

public class Programme18 {
    public  void myArray() {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) {
        Programme18 t = new Programme18();
        t.myArray();
    }
}
