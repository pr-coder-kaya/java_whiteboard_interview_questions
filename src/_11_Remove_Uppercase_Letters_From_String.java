public class _11_Remove_Uppercase_Letters_From_String {
    /*
    Write a method that takes a String and return String back with all uppercase letters removed

    TEST DATA:
    Hello World!

    EXPECTED OUTPUT:
    ello orld!
     */

    public static String noUppercaseLetters(String str){
        return str.replaceAll("[A-Z]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noUppercaseLetters("Hello World!")); // ello orld!
    }
}
