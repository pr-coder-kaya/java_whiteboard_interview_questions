public class _07_Remove_Letters_From_String {
    /*
    Write a method that takes a String and return String back with all letters removed

    TEST DATA:
    Time is 8 PM.

    EXPECTED OUTPUT:
    [  8 .]
     */

    public static String noLetters(String str){
        return str.replaceAll("[A-Za-z]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noLetters("[Time is 8 PM.]")); // [  8 .]
    }
}
