public class _06_Remove_Spaces_From_String {
    /*
    Write a method that takes a String and return String back with all spaces removed

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    Javaisfun
     */

    public static String noSpaces(String str){
        return str.replaceAll(" ", "");
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(noSpaces("Java is fun")); // Javaisfun
    }
}
