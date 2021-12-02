public class _34_Count_Spaces_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of spaces as an int

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    2
     */

    public static int countSpaces(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isSpaceChar(c)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countSpaces("Java is fun")); // 2
    }
}
