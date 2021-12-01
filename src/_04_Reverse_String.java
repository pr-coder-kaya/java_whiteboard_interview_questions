public class _04_Reverse_String {
    /*
    Write a method that takes a String and returns reversed String

    TEST DATA:
    Hello

    EXPECTED OUTPUT:
    olleH
     */

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(reverseString("Hello")); // olleH
    }
}
