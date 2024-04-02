// My first calculator in JAVA
public class Calculator {
    // Constructor
    public Calculator() {
    
    }

    // Methods
    public int add(int a, int b){
    return a + b;
    }

    public int substract(int a, int b){
      return a - b;
    }

    public int multiply(int a, int b){
      return a * b;
    }

    public int divide(int a, int b){
      return a / b;
    }

    public int modulo(int a, int b){
      return a % b;
    }
    //main
   public static void main(String[] args) {
      Calculator diskoCalc = new Calculator();
      System.out.println(diskoCalc.add(5, 7));
      System.out.println(diskoCalc.substract(45, 11));
    }
}