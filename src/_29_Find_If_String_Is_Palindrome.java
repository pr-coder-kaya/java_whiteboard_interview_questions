public class _29_Find_If_String_Is_Palindrome {
    /*
    Write a method that takes a String argument and returns a boolean. It will return true if given String is palindrome, and false otherwise
    Palindrome: it is a word that reads the same backward as forward
    Ex: kayak, civic, madam

    TEST DATA:
    Hello

    EXPECTED OUTPUT:
    false

    TEST DATA:
    civic

    EXPECTED OUTPUT:
    true
     */

    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello")); // false
        System.out.println(isPalindrome("civic")); // true
    }
}
