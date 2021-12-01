public class _20_Count_Zeros_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the count of zeros

    TEST DATA:
    [3, 5, 4, 0, 0]

    EXPECTED OUTPUT:
    2
     */

    public static int countZeros(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number == 0) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countZeros(new int[]{3, 5, 4, 0, 0})); // 2
    }
}
