public class _14_Print_Even_Numbers_From_1_To_Given {
    /*
    Write a method that takes a positive int argument and prints all the even numbers from 1 to given number

    TEST DATA:
    10

    EXPECTED OUTPUT:
    2
    4
    6
    8
    10
     */

    public static void printEvenNumbersOneTo(int number){
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }


    //Testing method
    public static void main(String[] args) {
        printEvenNumbersOneTo(10);
    }
}
