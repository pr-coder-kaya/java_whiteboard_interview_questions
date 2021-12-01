public class _17_Sum_Of_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the sum of all int elements

    TEST DATA:
    [0, -5, 3, 5, 4]

    EXPECTED OUTPUT:
    7
     */

    public static int sumOfNumbers(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(new int[]{0, -5, 3, 5, 4})); // 7
    }
}
