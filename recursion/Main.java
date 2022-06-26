// Run code with JAVA
// javac Main.java
// java Main
// or 
// java Main.java
// or online-ide (https://www.online-ide.com/az0J2FyEgT)

public class Main {
    public static void main(String[] args) {
        int test = 5;
        System.out.println("tri_recursion");
        tri_recursion(test);
        System.out.println("\nprintFun");
        printFun(test);
    }

    public static int tri_recursion(int k) {
        int result;
        if (k > 0) {
          result = k + tri_recursion(k - 1);
          System.out.println(k + " : " + result);
        } else {
          result = 0;
        }
        return result;
    }
      
    public static int printFun(int test) {
        if (test < 1) {
          return 0;
        }
        System.out.print(test + " ");
        printFun(test - 1);
        System.out.print(test + " ");
        return 0;
    }
}
