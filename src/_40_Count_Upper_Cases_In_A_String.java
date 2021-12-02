public class _40_Count_Upper_Cases_In_A_String {
    /*
    Write a method that takes a String argument and returns the count of upper cases as an int

    TEST DATA:
    Java is fun

    EXPECTED OUTPUT:
    1
     */

    public static int countUpperCases(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countUpperCases("Java is fun")); // 1
    }
}
