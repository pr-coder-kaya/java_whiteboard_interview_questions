public class _53_Reverse_A_Number_Without_String {
    /*
    Write a method that takes an int argument and returns it back reversed without converting it to a String

    TEST DATA:
    371

    10 + 7 -> 17*10 -> 170 + 3 -> 173

    EXPECTED OUTPUT:
    173

    TEST DATA:
    12

    EXPECTED OUTPUT:
    21
     */

    public static int reverseNumber(int num){
        int reversedNumber = 0;

        while(num != 0){
            reversedNumber += num % 10;

            num /= 10;
            if(num != 0) reversedNumber *= 10;
        }

        return reversedNumber;
    }


    // Testing method
    public static void main(String[] args) {
        System.out.println(reverseNumber(371)); // 173
        System.out.println(reverseNumber(12)); // 21
    }
}
