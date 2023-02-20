package lms_127

fun task6(base1: Double, base2: Double, height: Double): Double {

    val result = 0.075 * base1 * height * base2
    return result
}

fun main() {
    println(task6(base1 = 10.0, base2 = 20.0, height = 1.0))
}
