fun main() {
    while (true) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        val x = readLine()!!
       kolkulate(a, b, x)

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

fun kolkulate(num1:Int, num2:Int, sign:String = "+"){
    when (sign){
        "+"->{
            val r = num1 + num2
            print("" + num1 + " + " + num2 + " = " + r)
        }
        "-"->print("$num1 + $num2 = ${num1-num2}")
        "*"->print(num1 * num2)
        "/"->print(num1 / num2)
        else ->
            print("Ошибка")


    }
}