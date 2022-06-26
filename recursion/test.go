// Run code with GO
// go run test.go
// or
// Go Playground - https://go.dev/play/p/jipYA8EmuUT

package main

import (
	"fmt"
)

func tri_recursion(k int) int {
  var result int;
  if (k > 0) {
    result = k + tri_recursion(k - 1)
    fmt.Printf("%v : %v \n", k, result)
  } else {
    result = 0
  }
  return result
}

func printFun(test int) int {
  if (test < 1){
    return 0
  }
  
  fmt.Printf("%v ",test)
  printFun(test - 1)
  fmt.Printf("%v ",test)
  return 0
}

func main() {
  test := 5

  print("tri_recursion\n")
  tri_recursion(test)
  print("\nprintFun\n")
  printFun(test) 
}
