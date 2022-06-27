// Run code with nodeJS
// node test.js

for (let i = 1; i <= 100; i++) {
  if (i % 15 == 0) {
    process.stdout.write("FizzBuzz\t");
  } else if (i % 3 == 0) {
    process.stdout.write("Fizz\t");
  } else if (i % 5 == 0) {
    process.stdout.write("Buzz\t");
  } else {
    process.stdout.write(`${i}\t`);
  }
}
