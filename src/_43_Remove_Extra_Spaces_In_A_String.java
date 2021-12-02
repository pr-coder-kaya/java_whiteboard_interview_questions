public class _43_Remove_Extra_Spaces_In_A_String {
    /*
    Write a method that takes a String as argument and returns the String back with all extra spaces removed

    TEST DATA:
    Java    is    fun

    EXPECTED OUTPUT:
    Java is fun
     */

    public static String removeExtraSpaces(String str){
        return str.trim().replaceAll("\\s+", " ");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(removeExtraSpaces("Java    is    fun  ")); // Java is fun
    }
}
