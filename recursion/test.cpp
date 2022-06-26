// Run code with g++ compiler
// g++ -o test.exe test.cpp
// or 
// online-ide (https://www.online-ide.com/2Knw0tyJ3z)

#include <iostream>
using namespace std;

int tri_recursion(int k) {
  int result;
  if(k > 0) {
    result = k + tri_recursion( k - 1 );
    cout << k << " : " << result << "\n";
  } else {
    result = 0;
  }
  return result;

}

void printFun(int test) {
  if(test < 1) {
    return;
  }
  cout << test << " ";
  printFun(test - 1);
  cout << test << " ";
  
  return;
}

int main() {
  int test = 5;
  cout << "tri_recursion\n";
  tri_recursion(test);
  cout << "\nprintFun\n";
  printFun(test);
  return 0;
}