public class _52_Find_If_A_Number_Is_ArmStrong {
    /*
    Write a method that takes an int argument and returns true if given number is arm-strong, and false otherwise
    NOTE: An Armstrong number is one whose sum of digits raised to the power three equals the number itself

    TEST DATA:
    371

    EXPECTED OUTPUT:
    true
     */

    public static boolean isArmStrong(int num){
        int sum = 0;
        int originNum = num;

        while(num != 0){
            int currentDigit = num % 10;
            sum += (currentDigit * currentDigit * currentDigit);

            num /= 10;
        }

        return sum == originNum;
    }

    //Testing method
    public static void main(String[] args) {
        System.out.println(isArmStrong(371)); // true
    }
}
