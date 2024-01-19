fun main() {
    while (true) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        val x = readLine()!!
        if (x == "+") {
            println(a + b)
        }
        if (x == "-") {
            println(a - b)
        }
        if (x == "*") {
            println(a * b)
        }
        if (x == "/") {
            println(a / b)
        }

    println("Нажмите 1 чтобы выйти")
    val z = readLine()!!
    if (z == "1") {
        print("Пока")
        break
    }
    else{
        continue
        }
    }}
