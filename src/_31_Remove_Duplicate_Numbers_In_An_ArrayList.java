import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _31_Remove_Duplicate_Numbers_In_An_ArrayList {
    /*
    Write a method that takes an Integer ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.

    TEST DATA:
    [0, 5, 4, 0, 0]

    EXPECTED OUTPUT:
    [0, 4, 5]
     */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        return new ArrayList<>(new HashSet<>(numbers));
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(removeDuplicateNumbers(new ArrayList(Arrays.asList(0, 5, 4, 0, 0)))); // [0, 4, 5]
    }
}
