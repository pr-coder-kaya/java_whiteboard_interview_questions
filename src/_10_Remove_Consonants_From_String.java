public class _10_Remove_Consonants_From_String {
    /*
    Write a method that takes a String and return String back with all consonants removed

    TEST DATA:
    Hello World!

    EXPECTED OUTPUT:
    eo o!
     */

    public static String noConsonants(String str){
        return str.replaceAll("[^aeiouAEIOU\\d\\W]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noConsonants("Hello World!")); // eo o!
    }
}
