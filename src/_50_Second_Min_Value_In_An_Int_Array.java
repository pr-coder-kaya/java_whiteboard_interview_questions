import java.util.ArrayList;
import java.util.TreeSet;

public class _50_Second_Min_Value_In_An_Int_Array {
    /*
    Write a method that takes an int array argument and returns the second min value as an int
    NOTE: Assume length of the array is always more than one

    TEST DATA:
    [-5, 4, 1, 10, 2]

    EXPECTED OUTPUT:
    1
     */

    public static int secondMinValue(int[] numbers){
        TreeSet<Integer> uniques = new TreeSet<>();
        for(int number : numbers) uniques.add(number);

        return new ArrayList<>(uniques).get(1);
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(secondMinValue(new int[]{-5, 4, 1, 10, 2})); // 1
    }
}
