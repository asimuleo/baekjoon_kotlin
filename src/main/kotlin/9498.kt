fun main(args: Array<String>) {
    val score = readln().toInt()
    if (score >= 90) println('A')
    else if (score >= 80) println('B')
    else if (score >= 70) println('C')
    else if (score >= 60) println('D')
    else println('F')
}