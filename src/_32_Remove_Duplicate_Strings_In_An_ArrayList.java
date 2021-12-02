import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _32_Remove_Duplicate_Strings_In_An_ArrayList {
    /*
    Write a method that takes a String ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.

    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]

    EXPECTED OUTPUT:
    [bar, 123, foo]
     */

    public static ArrayList<String> removeDuplicateStrings(ArrayList<String> strings){
        return new ArrayList<>(new HashSet<>(strings));
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(removeDuplicateStrings(new ArrayList(Arrays.asList("foo", "bar", "foo", "123", "bar")))); // [bar, 123, foo]
    }
}
