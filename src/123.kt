fun x() {
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
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val x = readLine()!!
    when (x){
        "+"->{
            val r = a + b
            print("" + a + " + " + b + " = " + r)
        }
        "-"->print("$a + $b = ${a-b}")
        "*"->print(a * b)
        "/"->print(a / b)
    else ->
        print("Ошибка")


    }    }

