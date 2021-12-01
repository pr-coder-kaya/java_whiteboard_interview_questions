public class _18_Product_Of_Numbers_In_An_Array {
    /*
    Write a method that takes an int array argument and returns the product of all int elements

    TEST DATA:
    [3, 5, 4]

    EXPECTED OUTPUT:
    60
     */

    public static int productOfNumbers(int[] numbers){
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(productOfNumbers(new int[]{3, 5, 4})); // 60
    }
}
