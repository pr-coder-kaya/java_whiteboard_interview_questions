public class _33_Fibonacci_Series_Of_Given_Number {
    /*
    Write method that takes an int argument and prints the Fibonacci series of given number
    DEFINITION: Fibonacci is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
    The simplest is the series 0, 1, 1, 2, 3, 5, 8, 13, 21

    TEST DATA:
    8

    EXPECTED OUTPUT:
    0
    1
    1
    2
    3
    5
    8
    13
     */

    public static void getFibonacciSeries(int number){
        int zero = 0, one = 1, sum;

        for(int i = 0; i < number; i++){
            System.out.println(zero);
            sum = zero + one;
            zero = one;
            one = sum;
        }
    }


    //Testing method
    public static void main(String[] args) {
        getFibonacciSeries(8);
    }
}
