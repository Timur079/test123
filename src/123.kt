fun main(){
    max(readLine()!!)
    task1()
    val list1: List<Int> = listOf(1, 2, 3)
    val list2: MutableList<String> = mutableListOf("1", "2", "3")
    list2.add("4")
}

fun max(x: String){
    val list: List<Int> = x.split(" ").map{
        it.toInt()
    }
    val m = list.maxOf { it }
    print(m)

}

fun kolkulate(num1:Int, num2:Int, sign:String = "+"):String{
    return when (sign){
        "+"->{
            val r = num1 + num2
             "" + num1 + " + " + num2 + " = " + r
        }
        "-"-> "$num1 - $num2 = ${num1-num2}"
        "*"-> "$num1 * $num2 = ${num1*num2}"
        "/"-> "$num1 / $num2 = ${num1.toFloat()/num2}"
        else ->
             "Ошибка"


    }
}

fun task1(){
    while (true) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        val x = readLine()!!
        kolkulate(a, b, x)
        println(kolkulate(a, b, x))
        println("Нажмите 1 чтобы выйти")
        val z = readLine()!!
        if (z == "1") {
            print("Пока")
            break
        }
        else{
            continue
        }
    }

}