public class _24_Count_Prime_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the count of prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    NOTE: The smallest prime number is 2
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.

    TEST DATA:
    [-3, 5, 4, 0, 11]

    EXPECTED OUTPUT:
    2
     */

    public static int countPrimeNumbers(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number == 2 || number == 3) count++;
            else if (number > 3){
                boolean prime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(countPrimeNumbers(new int[]{-3, 5, 4, 0, 11})); // 2
    }
}
