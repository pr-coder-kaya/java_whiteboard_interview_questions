import java.util.Arrays;
import java.util.HashSet;

public class _28_Remove_Duplicate_Strings_In_An_Array {
    /*
    Write a method that takes a String array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.

    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]

    EXPECTED OUTPUT:
    [bar, 123, foo]
     */

    public static String[] removeDuplicateStrings(String[] strings){
        return new HashSet<>(Arrays.asList(strings)).toArray(new String[0]);
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicateStrings(new String[]{"foo", "bar", "foo", "123", "bar"}))); // [bar, 123, foo]
    }
}
