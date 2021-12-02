public class _08_Remove_Specials_From_String {
    /*
    Write a method that takes a String and return String back with all specials removed

    TEST DATA:
    The price = 100.50$

    EXPECTED OUTPUT:
    The price  10050
     */

    public static String noSpecials(String str){
        return str.replaceAll("[^a-zA-Z0-9 ]", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noSpecials("The price = 100.50$")); // The price  10050
    }
}
