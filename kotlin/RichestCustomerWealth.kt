fun main() {
    println(maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7, 3), intArrayOf(3,5))))
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    for (i in accounts.indices) {
        max = Math.max(accounts[i].sum(), max)
    }

    return max
}