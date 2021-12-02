public class _36_Count_Digits_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of digits as an int

    TEST DATA:
    Happy 2022!

    EXPECTED OUTPUT:
    4
     */

    public static int countDigits(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countDigits("Happy 2022!")); // 4
    }
}
