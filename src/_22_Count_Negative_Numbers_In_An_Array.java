public class _22_Count_Negative_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the count of negative numbers

    TEST DATA:
    [-3, 5, 4, 0, -2]

    EXPECTED OUTPUT:
    2
     */

    public static int countNegativeNumbers(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number < 0) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countNegativeNumbers(new int[]{-3, 5, 4, 0, -2})); // 2
    }
}
