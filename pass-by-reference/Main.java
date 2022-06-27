// Run code with JAVA
// javac Main.java
// java Main
// or 
// java Main.java
// or online-ide (https://www.online-ide.com/ltNHTxgm8Y)

public class Main {
    
    int firstNum;
    int secondNum;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.firstNum = 25;
        obj.secondNum = 20; 
        
        System.out.println("Before swap:");
        System.out.println(obj.firstNum + " - " + obj.secondNum);
        
        swapNums(obj);
                
        System.out.println("After swap:");
        System.out.println(obj.firstNum + " - " + obj.secondNum);
    }

    public static void swapNums(Main obj) {
        int tmp = obj.firstNum;
        obj.firstNum = obj.secondNum;
        obj.secondNum = tmp;
    }

}
