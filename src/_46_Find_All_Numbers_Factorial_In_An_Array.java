import java.util.Arrays;

public class _46_Find_All_Numbers_Factorial_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the array back with all elements replaced with their factorial.
    Factorial is the operation of multiplying any natural number with all the natural numbers that are smaller than it
    Ex: 4! = 4*3*2*1, so the result is 24
    NOTE: 0! = 1
    NOTE: Negative numbers are not considered in this method

    TEST DATA:
    [0, 5, 4, 1, 3, 2]

    EXPECTED OUTPUT:
    [1, 120, 24, 1, 6, 2]
     */

    public static int[] factorial(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else{
                int number =  numbers[i];
                for (int j = 2; j < number; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(Arrays.toString(factorial(new int[]{0, 5, 4, 1, 3, 2}))); // [1, 120, 24, 1, 6, 2]
    }
}
