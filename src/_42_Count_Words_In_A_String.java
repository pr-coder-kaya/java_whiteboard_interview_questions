public class _42_Count_Words_In_A_String {
    /*
    Write a method that takes a String as argument and returns the count of words as an int

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    3
     */

    public static int countWords(String str){
        String[] words = str.trim().split("\\s+");
        return words.length;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countWords("Java is fun")); // 3
    }
}
