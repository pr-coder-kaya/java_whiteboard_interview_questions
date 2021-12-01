import java.util.Arrays;

public class _03_Middle_Number_Of_3 {
    /*
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay

    TEST DATA:
    4, 4, 5

    EXPECTED OUTPUT:
    4
     */

    public static int getMiddle(int a, int b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(getMiddle(4, 4, 5)); // 4
    }
}
