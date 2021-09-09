public class Factorial{

    //Head recursion
    //Time Complexity: 0(2^n)
    public static int factorial(int n) {
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    //Tail recursion
    public static int factorial(int n, int result) { //result is accumlator
        if(n == 0){
            return result;
        }
        return factorial(n-1, n*result);
    }


    public static void main(String[] args) {
        System.out.println(factorial(3));

        System.out.println(factorial(3,1));
    }
}