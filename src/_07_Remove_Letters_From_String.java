public class _07_Remove_Letters_From_String {
    /*
    Write a method that takes a String and return String back with all letters removed

    TEST DATA:
    1. Time is 8 PM.

    EXPECTED OUTPUT:
    1.   8 .
     */

    public static String noSpaces(String str){
        return str.replaceAll("[A-z]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noSpaces("1. Time is 8 PM.")); // 1.   8 .
    }
}
