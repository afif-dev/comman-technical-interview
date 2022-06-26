// Run code with nodeJS
// node test.js

function swapNums(obj) {
  let tmp = obj.firstNum;
  obj.firstNum = obj.secondNum;
  obj.secondNum = tmp;
}

let obj = {
  firstNum: 25,
  secondNum: 20,
};

console.log("Before swap:");
console.log(`${obj.firstNum} - ${obj.secondNum}`);

swapNums(obj);

console.log("After swap:");
console.log(`${obj.firstNum} - ${obj.secondNum}`);
