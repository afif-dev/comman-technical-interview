// Note: Java is Strictly Pass by Value!
// Run code with JAVA
// javac Main.java
// java Main
// or 
// java Main.java
// or online-ide (https://www.online-ide.com/MadZJT5DUu)

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 15 == 0) {
              System.out.print("FizzBuzz\t");
            } else if (i % 3 == 0) {
              System.out.print("Fizz\t");  
            } else if (i % 5 == 0) {
              System.out.print("Buzz\t");  
            } else {
              System.out.print(i + "\t");
            }
        }
    }
}
