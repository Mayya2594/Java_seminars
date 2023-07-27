package Seminar_1;
public class Calculator {
    
  public int calculate(char op, int a, int b) {
      if (op == '+') {
        return a + b;
      } else if (op == '-') {
        return a - b;
      } else if (op == '*') {
        return a * b;
      } else if (op == '/') {
        return a / b;
      } else {
        // System.out.println("Некорректный оператор: " + op);
        // return -1;
        throw new IllegalStateException("Неверный оператор: " + op);
      }
  }  

      /* 
  public int calculate(char op, int a, int b) {   
      switch (op) {
        case '+':
          return plus(a, b);
        case '-':
          return minus(a, b);
        case '*':
          return mult(a, b);
        case '/':
          return divide(a, b);
        default:
          throw new IllegalStateException("Неверный оператор: " + op);
      }
  }  
    private int plus (int a, int b) {
      return a + b;
    }

    private int minus (int a, int b) {
      return a - b;
    }

    private int mult (int a, int b) {
      return a * b;
    }

    private int divide (int a, int b) {
      if (b != 0) return a / b;
      else return -1;
    }
    */
  }