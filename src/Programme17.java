//Write a Java program to sort a numeric array and a string array.


import java.util.Arrays;

public class Programme17 {

    public void myArrays(){
            int[] num={4,5,7,6,8};
            String[] str={"Prime", "Testing"};

            Arrays.toString(num);
            Arrays.toString(str);


            System.out.println(Arrays.toString(num));
            System.out.println(Arrays.toString(str));

            Arrays.sort(num);
            Arrays.sort(str);

            System.out.println(Arrays.toString(num));
            System.out.println(Arrays.toString(str));

        }

    public static void main(String[] args) {
        Programme17 t = new Programme17();
        t.myArrays();
    }
    }

