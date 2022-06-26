// Note: Kotlin is Strictly Pass by Value!
// Run code with Kotlin Playground https://play.kotlinlang.org/ or https://pl.kotl.in/BQcpQYI2S
// or 
// Kotlin command-line compiler (https://kotlinlang.org/docs/command-line.html)
// kotlinc test.kt -include-runtime -d test-kt.jar
// java -jar .\test-kt.jar

class Obj {
    var firstNum: Int = 0
    var secondNum: Int = 0
}

fun swapNums(obj: Obj) {
    var tmp = obj.firstNum
    obj.firstNum = obj.secondNum
    obj.secondNum = tmp
}

fun main() {
    val obj = Obj()

    obj.firstNum = 25
    obj.secondNum = 20
    
    println("Before swap:")
    println(obj.firstNum.toString() + " - " + obj.secondNum.toString())

    swapNums(obj)

    println("After swap:")
    println(obj.firstNum.toString() + " - " + obj.secondNum.toString())
}
