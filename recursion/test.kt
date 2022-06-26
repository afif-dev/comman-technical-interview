// Run code with Kotlin Playground https://play.kotlinlang.org/ or https://pl.kotl.in/x1ZC_YqCw
// or 
// Kotlin command-line compiler (https://kotlinlang.org/docs/command-line.html)
// kotlinc test.kt -include-runtime -d test-kt.jar
// java -jar .\test-kt.jar

fun main() {
    val test = 5
    println("tri_recursion")
    tri_recursion(test)
    println("\nprintFun")
    printFun(test)
}

fun tri_recursion(test: Int) : Int {
    var result: Int
    if (test > 0) {
      result = test + tri_recursion(test - 1);
	  println(test.toString() + " : " + result.toString());
    } else {
      result = 0;
    }
    return result;
}
  
fun printFun(test: Int) {
    if (test < 1) {
      return;
    }
    print(test.toString() + " ");
    printFun(test - 1);
    print(test.toString() + " ");
    return;
}
