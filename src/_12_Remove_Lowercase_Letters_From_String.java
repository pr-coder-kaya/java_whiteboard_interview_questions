public class _12_Remove_Lowercase_Letters_From_String {
    /*
    Write a method that takes a String and return String back with all uppercase letters removed

    TEST DATA:
    Hello World!

    EXPECTED OUTPUT:
    H W!
     */

    public static String noUppercaseLetters(String str){
        return str.replaceAll("[a-z]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noUppercaseLetters("Hello World!")); // H W!
    }
}
