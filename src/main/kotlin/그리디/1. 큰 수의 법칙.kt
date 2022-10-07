package 그리디

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    scanner.nextInt()
    val m = scanner.nextInt() // 수 횟수
    val k = scanner.nextInt() // 특정 인덱스 반복 가능 횟수
    scanner.nextLine()
    val list: List<Long> = scanner.nextLine().split(' ').map { it.toLong() }

    val max1 = list.max()
    val max2 = list.minus(max1).maxOrNull() ?: max1

    val max1Cnt = m / k
    val max2Cnt = m % k

    println((k * max1Cnt * max1) + (max2Cnt * max2))


}