public class _05_Remove_Digits_From_String {
    /*
    Write a method that takes a String and return String back with all digits removed

    TEST DATA:
    a1b2c3

    EXPECTED OUTPUT:
    abc
     */

    public static String noDigits(String str){
        return str.replaceAll("[0-9]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noDigits("a1b2c3")); // abc
    }
}
