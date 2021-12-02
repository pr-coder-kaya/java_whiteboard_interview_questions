public class _09_Remove_Vowels_From_String {
    /*
    Write a method that takes a String and return String back with all vowels removed

    TEST DATA:
    Hello World!

    EXPECTED OUTPUT:
    Hll Wrld!
     */

    public static String noVowels(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noVowels("Hello World!")); // Hll Wrld!
    }
}
