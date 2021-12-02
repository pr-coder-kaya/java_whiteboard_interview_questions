import java.util.Arrays;
import java.util.HashSet;

public class _27_Remove_Duplicate_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.

    TEST DATA:
    [0, 5, 4, 0, 0]

    EXPECTED OUTPUT:
    [0, 4, 5]
     */

    public static int[] removeDuplicateNumbers(int[] numbers){
        HashSet<Integer> uniques = new HashSet<>();
        for(int i : numbers) uniques.add(i);

        int[] arr = new int[uniques.size()];

        int index = 0;
        for(int i : uniques) arr[index++] = i;

        return arr;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicateNumbers(new int[]{0, 5, 4, 0, 0}))); // [0, 4, 5]
    }
}
