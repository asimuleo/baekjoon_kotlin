package 그리디

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt() // 어떤 수
    val k = scanner.nextInt() // 나누는 수

    var cnt = 0

    while (n > 1) {
        if (n % k == 0) {
            n /= k
            cnt++
        } else {
            val remainder = n % k
            n -= (remainder)
            cnt += remainder
        }

    }

    println(cnt)


}