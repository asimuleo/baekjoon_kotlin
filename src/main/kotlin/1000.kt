fun main(args: Array<String>) {
    val readln = readln()
    println(readln.split(' ').sumOf { it.toInt() })
}