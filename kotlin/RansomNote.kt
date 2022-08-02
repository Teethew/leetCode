fun main() = println(canConstruct("aa", "aab"))

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val ransomNoteOrdered = ransomNote.toCharArray().sorted()

    var magazineOrdered = magazine.toCharArray().sorted()

    var finalList = emptyList<Char>()

    println("ransomNoteOrdered $ransomNoteOrdered")

    for (element in ransomNoteOrdered) {
        println("finalList $finalList")
        println("magazineOrdered $magazineOrdered")

        if (magazineOrdered.contains(element)) {
            finalList = finalList + element
            magazineOrdered = magazineOrdered.minusElement(element)
            continue
        }
    }

    println("finalList $finalList")
    println("magazineOrdered $magazineOrdered")

    return finalList == ransomNoteOrdered
}