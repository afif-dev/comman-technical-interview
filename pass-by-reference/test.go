// Run code with GO
// go run test.go
// or
// Go Playground - https://go.dev/play/p/4rkSI7vSDR4

package main

import (
	"fmt"
)

func swapNums(x *int, y *int) {
	tmp := *x 
	*x = *y
	*y = tmp  
 }

func main() {

  firstNum := 25
  secondNum := 20

  fmt.Printf("Before swap : %d - %d\n", firstNum, secondNum )
  swapNums(&firstNum, &secondNum)
  fmt.Printf("After swap : %d - %d\n", firstNum, secondNum )
}