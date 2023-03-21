//20. Write a Java program to test if an array contains a specific value.

public class Programme20 {

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] my_array1 = { 100, 200, 300, 400, 500, 600, 700 };

        System.out.println(contains(my_array1, 200));

        System.out.println(contains(my_array1, 800));
    }
}
