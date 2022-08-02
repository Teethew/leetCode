import kotlin.collections.ArrayList

fun main() {
    println(fizzBuzz(5))
}

fun fizzBuzz(n: Int): List<String> {
    val result = ArrayList<String>(n)

    for(i in 1..n) {
        val index = i - 1

        if (i % 5 == 0 && i % 3 == 0) {
            result.add("FizzBuzz")
            continue
        }
        if (i % 3 == 0) {
            result.add("Fizz")
            continue
        }
        if (i % 5 == 0) {
            result.add("Buzz")
            continue
        }

        result.add(i.toString())
    }

    return result
}