public class _37_Count_Specials_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of specials as an int

    TEST DATA:
    The date was 10/10/1990

    EXPECTED OUTPUT:
    2
     */

    public static int countSpecials(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countSpecials("The date was 10/10/1990")); // 2
    }
}
