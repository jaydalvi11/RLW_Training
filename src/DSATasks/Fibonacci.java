package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
    int res = fibo(6);
        System.out.println(res);
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

}
