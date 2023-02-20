package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    a -= b
    b += a
    a = b - a

    // Do not erase or change this statement
    return Pair(a, b)
}

fun main() {
    val a = 1
    val b = 2
    println(task5(a,b))
}
