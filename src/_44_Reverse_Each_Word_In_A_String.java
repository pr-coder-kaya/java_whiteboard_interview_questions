public class _44_Reverse_Each_Word_In_A_String {
    /*
    Write a method that takes a String as argument and returns the String back with each word reversed in the same place

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    avaJ si nuf
     */

    public static String reverseEachWord(String str){
        StringBuilder result = new StringBuilder();
        for(String word : str.split(" ")){
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Java is fun")); // avaJ si nuf
    }
}
