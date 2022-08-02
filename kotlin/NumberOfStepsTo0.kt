fun main() {
    val input = readln()

    println(numberOfSteps(input.toInt()))
}

fun numberOfSteps(num: Int): Int {
    var steps: Int = 0
    var n = num

    while (n != 0) {
        steps++
        if (n % 2 == 0) n /= 2
        else n -= 1
    }

    return steps
}