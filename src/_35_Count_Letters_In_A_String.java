public class _35_Count_Letters_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of letters as an int

    TEST DATA:
    Hello World!

    EXPECTED OUTPUT:
    10
     */

    public static int countLetters(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countLetters("Hello World!")); // 10
    }
}
