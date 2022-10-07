package 그리디

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() // 행 개수
    scanner.nextInt() // 열 개수
    scanner.nextLine()

    println(
        (1..n).asSequence().map {
            scanner.nextLine().split(' ').minOfOrNull { it.toInt() } ?: 0
        }.max()
    )


}