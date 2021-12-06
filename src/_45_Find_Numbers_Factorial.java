public class _45_Find_Numbers_Factorial {
    /*
    Write a method that takes an int argument and returns number’s factorial.
    Factorial is the operation of multiplying any natural number with all the natural numbers that are smaller than it
    Ex: 4! = 4*3*2*1, so the result is 24
    NOTE: 0! = 1
    NOTE: Negative numbers are not considered in this method

    TEST DATA:
    5

    EXPECTED OUTPUT:
    120
     */

    public static int factorial(int number){
        if(number == 0 || number == 1) return 1;
        else {
            int temp = number;
            for (int i = 2; i < temp; i++) {
                number *= i;
            }
        }
        return number;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
