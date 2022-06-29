import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()

    if (b - 45 < 0) {
        if (a == 0) {
            a = 23
        } else {
            a -= 1
        }
        b += 15
    } else {
        b -= 45
    }

    println("$a $b")
}