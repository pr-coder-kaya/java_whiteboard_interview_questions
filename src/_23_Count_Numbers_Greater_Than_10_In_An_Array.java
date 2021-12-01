public class _23_Count_Numbers_Greater_Than_10_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the count of numbers greater than 10

    TEST DATA:
    [-3, 15, 44, 0, -2]

    EXPECTED OUTPUT:
    2
     */

    public static int countNumbersGreaterThan10(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number > 10) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countNumbersGreaterThan10(new int[]{-3, 15, 44, 0, -2})); // 2
    }
}
