public class _51_Find_Nth_Word_In_A_String {
    /*
    Write a method that takes a String and an int arguments and returns the nth word in the String

    TEST DATA:
    ("I like programming languages", 2)

    EXPECTED OUTPUT:
    like
     */

    public static String nthWord(String str, int n){
        return str.split("\\s")[n-1];
    }

    //Testing method
    public static void main(String[] args) {
        System.out.println(nthWord("I like programming languages", 2)); // like
    }
}
