import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _38_Count_Vowels_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of vowels as an int

    TEST DATA:
    I like Java

    EXPECTED OUTPUT:
    5
     */

    public static int countVowels(String str){
        int count = 0;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");

        for(char c : str.toCharArray()){
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if(matcher.matches()) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countVowels("I like Java")); // 5
    }
}
