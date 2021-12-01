public class _13_Print_Numbers_From_1_To_Given {
    /*
    Write a method that takes a positive int argument and prints all the numbers from 1 to given number

    TEST DATA:
    5

    EXPECTED OUTPUT:
    1
    2
    3
    4
    5
     */

    public static void printNumbersOneTo(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }


    //Testing method
    public static void main(String[] args) {
        printNumbersOneTo(5);
    }
}
