public class _41_Count_Lower_Cases_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of lower cases as an int

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    8
     */

    public static int countLowerCases(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countLowerCases("Java is fun")); // 8
    }
}
