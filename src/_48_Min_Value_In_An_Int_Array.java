import java.util.Arrays;

public class _48_Min_Value_In_An_Int_Array {
    /*
    Write a method that takes an int array argument and returns the min value as an int
    NOTE: Assume length of the array is always more than zero

    TEST DATA:
    [-5, 4, 1, 10, 2]

    EXPECTED OUTPUT:
    -5
     */

    public static int minValue(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(minValue(new int[]{-5, 4, 1, 10, 2})); // -5
    }
}
