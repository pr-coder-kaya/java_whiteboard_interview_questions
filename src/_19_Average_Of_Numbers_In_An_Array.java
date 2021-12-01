public class _19_Average_Of_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the average of all int elements

    TEST DATA:
    [3, 5, 4, 0, -2]

    EXPECTED OUTPUT:
    2
     */

    public static int averageOfNumbers(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(averageOfNumbers(new int[]{3, 5, 4, 0, -2})); // 2
    }
}
