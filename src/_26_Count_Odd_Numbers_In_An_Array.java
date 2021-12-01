public class _26_Count_Odd_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the count of odd numbers

    TEST DATA:
    [-3, 5, 4, 0, -2]

    EXPECTED OUTPUT:
    2
     */

    public static int countOddNumbers(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number < 0) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countOddNumbers(new int[]{-3, 5, 4, 0, -2})); // 2
    }
}
