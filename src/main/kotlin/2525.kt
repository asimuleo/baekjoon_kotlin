import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    val c = scanner.nextInt()

    a = (a + (c / 60)) % 24

    val plusMinute = c % 60

    if (b + plusMinute >= 60) {
        if (a == 23) {
            a = 0
        } else {
            a += 1
        }
        b += plusMinute - 60
    } else {
        b += plusMinute
    }

    println("$a $b")
}