fun main() = println(romanToInt("CMLXI"))

fun romanToInt(s: String): Int {
    val charArray = s.toCharArray()
    val intList = IntArray(charArray.size) { 0 }

    for (i in charArray.indices) {
        intList[i] = when(charArray[i]) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> { 0 }
        }
    }

    for (i in 0..intList.size - 2)  {
        if (intList[i] < intList[i + 1]) intList[i] = 0 - intList[i]
    }

    return intList.sum()
}