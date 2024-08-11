//time complexity:O(log n), space: O(1)
fun singleNumber(nums: IntArray): Int {
    //[2,2,1]
    var single = 0
    for(num in nums){
        single = single xor num // num = 2: 0000 XOR 0010 = 0010, num = 2: 0010 XOR 0010 = 0000, num = 1:0000 XOR 0001 = 0001
    }
    return single
}
