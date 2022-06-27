// Run code with g++ compiler
// g++ -o test.exe test.cpp
// or 
// online-ide (https://www.online-ide.com/goCePVh2zt)

#include <iostream>
using namespace std;

int main() {
  for (int i = 1; i <= 100; i++)
  {
    if(i % 15 == 0) {
      printf("FizzBuzz\t");
    } else if (i % 3 == 0) {
      printf("Fizz\t");  
    } else if (i % 5 == 0) {
      printf("Buzz\t");  
    } else {
      printf("%d\t", i);
    }
  }
  return 0;
}
