public class _15_Print_Odd_Numbers_From_1_To_Given {
    /*
    Write a method that takes a positive int argument and prints all the odd numbers from 1 to given number

    TEST DATA:
    9

    EXPECTED OUTPUT:
    1
    3
    5
    7
    9
     */

    public static void printOddNumbersOneTo(int number){
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 1) System.out.println(i);
        }
    }


    //Testing method
    public static void main(String[] args) {
        printOddNumbersOneTo(9);
    }
}
