// Run code with GO
// go run test.go
// or
// Go Playground - https://go.dev/play/p/4amSpXO-4yn

package main

import (
	"fmt"
)

func main() {
  for i := 1; i <= 100; i++ {
    if i%15 == 0 {
      fmt.Print("FizzBuzz\t")  
    } else if i%3 == 0 {
      fmt.Print("Fizz\t")  
    } else if i%5 == 0 {
      fmt.Print("Buzz\t")  
    } else {
      fmt.Printf("%d\t", i) 
    }
  }
}
