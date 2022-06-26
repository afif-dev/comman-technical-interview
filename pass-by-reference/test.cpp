// Run code with g++ compiler
// g++ -o test.exe test.cpp

#include <iostream>
using namespace std;

void swapNums(int &x, int &y) {
  int z = x;
  x = y;
  y = z;
}

int main() {
  int firstNum = 25;
  int secondNum = 20;

  cout << "Before swap: " << "\n";
  cout << firstNum << " - " << secondNum << "\n";

  swapNums(firstNum, secondNum);

  cout << "After swap: " << "\n";
  cout << firstNum <<  " - " << secondNum << "\n";

  return 0;
}