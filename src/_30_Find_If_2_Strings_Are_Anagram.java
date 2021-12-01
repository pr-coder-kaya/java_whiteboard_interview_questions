import java.util.Arrays;

public class _30_Find_If_2_Strings_Are_Anagram {
    /*
    Write a method that takes a String argument and returns a boolean. It will return true if given String is palindrome, and false otherwise
    Anagram: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
    Ex: listen-silent | cinema-iceman

    TEST DATA:
    Hello, World

    EXPECTED OUTPUT:
    false

    TEST DATA:
    cinema, iceman

    EXPECTED OUTPUT:
    true
     */

    public static boolean isAnagram(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "World")); // false
        System.out.println(isAnagram("cinema", "iceman")); // true
    }
}
