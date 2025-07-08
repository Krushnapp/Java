package DP;

class main{

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return  fib(n-1)+fib(n-2);
    }

}
//✅ What is DP?
//Dynamic Programming is an optimization technique used to solve problems by breaking them down into overlapping subproblems and storing results to avoid recomputation.
//
//✅ When to Use DP?
//Ask these:
//
//Optimal substructure — Can you solve the problem by combining subproblem solutions?
//
//Overlapping subproblems — Are subproblems reused?
//Top-Down (Memoization)
//java
//        Copy
//Edit
//int fib(int n, int[] dp) {
//    if (n <= 1) return n;
//    if (dp[n] != -1) return dp[n];
//    return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
//}
//Bottom-Up (Tabulation)
//java
//        Copy
//Edit
//int fib(int n) {
//    int[] dp = new int[n + 1];
//    dp[0] = 0; dp[1] = 1;
//    for (int i = 2; i <= n; i++)
//        dp[i] = dp[i - 1] + dp[i - 2];
//    return dp[n];
//}
