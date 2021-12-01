public class _25_Count_Even_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the count of even numbers

    TEST DATA:
    [-3, 5, 4, 0, -2]

    EXPECTED OUTPUT:
    3
     */

    public static int countEvenNumbers(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number % 2 == 0) count++;
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countEvenNumbers(new int[]{-3, 5, 4, 0, -2})); // 3
    }
}
