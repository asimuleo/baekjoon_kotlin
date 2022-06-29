import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a == b && b == c) {
        println(10000 + a * 1000)
    } else if (a == b) {
        println(1000 + a * 100)
    } else if (b == c) {
        println(1000 + b * 100)
    } else if (a == c) {
        println(1000 + a * 100)
    } else {
        println(maxOf(a, b, c) * 100)
    }
}