// Run code with nodeJS
// node test.js

function tri_recursion(k) {
  if (k > 0) {
    result = k + tri_recursion(k - 1);
    console.log(`${k} : ${result}`);
  } else {
    result = 0;
  }
  return result;
}

function printFun(test) {
  if (test < 1) {
    return;
  }
  process.stdout.write(`${test} `);
  printFun(test - 1);
  process.stdout.write(`${test} `);

  return;
}

test = 5;
console.log("tri_recursion");
tri_recursion(test);
console.log("\nprintFun");
printFun(test);
