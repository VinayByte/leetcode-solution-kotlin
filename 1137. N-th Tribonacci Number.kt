/**
The tribonacci series is a generalization of the Fibonacci sequence where each term is the sum of the three preceding terms.
The Tribonacci Sequence: 
0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513, 35890, 66012, 121415, 223317, 410744, 755476, 1389537, 2555757, 4700770, 8646064, 15902591, 29249425, 53798080, 98950096, 181997601, 334745777, 615693474, 1132436852… so on
General Form of Tribonacci number: 
 

a(n) = a(n-1) + a(n-2) + a(n-3) 
with 
a(0) = a(1) = 0, a(2) = 1. 
*/
class Solution {
    fun tribonacci(n: Int): Int {
        if(n == 0){
            return 0
        }
        if(n==1 || n == 2) return 1

        var a = 0 //T_0
        var b = 1 //T_1
        var c = 1 //T_2

        for(i in 3..n){
            val next = a + b + c
            a = b
            b = c
            c = next
        }
        return c
    }
}
