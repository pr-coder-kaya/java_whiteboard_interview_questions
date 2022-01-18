public class _01_Greatest_Number_Of_3 {
    /*
    Write a method that takes 3 int arguments and returns the greatest number
    NOTE: 2 or 3 numbers being same is okay

    TEST DATA:
    3, 3, 5

    EXPECTED OUTPUT:
    5
     */

    //WAY 1: Use Math.max() method to find max value of 3 int variables as below
    /*
    public static int getGreatest(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
     */

    //WAY 2: Use if else statements to find max value of 3 int variables as below
    public static int getGreatest(int a, int b, int c){
        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        return c;
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(getGreatest(3, 3, 5)); // 5
    }
}
