fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val x = readLine()!!
    if (x == "+") {
        print(a + b)
    }
    if (x == "-") {
        print(a - b)
    }
    if (x == "*") {
        print(a * b)
    }
    if (x == "/") {
        print(a / b)
    }
}