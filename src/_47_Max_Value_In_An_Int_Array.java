import java.util.Arrays;

public class _47_Max_Value_In_An_Int_Array {
    /*
    Write a method that takes an int array argument and returns the max value as an int
    NOTE: Assume length of the array is always more than zero

    TEST DATA:
    [-5, 4, 1, 10, 2]

    EXPECTED OUTPUT:
    10
     */

    public static int maxValue(int[] numbers){
       Arrays.sort(numbers);
       return numbers[numbers.length-1];
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{-5, 4, 1, 10, 2})); // 10
    }
}
