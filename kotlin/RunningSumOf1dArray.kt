fun main() {

    val result = runningSum(intArrayOf(1,2,3,4))
    println(result.asList()) //[1,3,6,10]
    // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
}

fun runningSum0(nums: IntArray): IntArray {
    val resultingList = IntArray(nums.size) { 0 }

    for (i in nums.indices) {
        var sum = 0
        for(j in 0..i) {
            sum += nums[j]
        }

        resultingList[i] = sum
    }

    return resultingList
}

fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] = nums[i] + nums[i - 1]
    }

    return nums
}
