// Run code with Kotlin Playground https://play.kotlinlang.org/ or https://pl.kotl.in/dZIKDAz2R
// or 
// Kotlin command-line compiler (https://kotlinlang.org/docs/command-line.html)
// kotlinc test.kt -include-runtime -d test-kt.jar
// java -jar .\test-kt.jar

fun main() {
    for (fizzbuzz in 1..100) {
      if (fizzbuzz % 15 == 0){
        print("FizzBuzz\t");
      } else if (fizzbuzz % 3 == 0) {
        print("Fizz\t");
      } else if (fizzbuzz % 5 == 0) {
        print("Buzz\t");
      } else {
        print(fizzbuzz.toString() + "\t");
      }
    }
}
