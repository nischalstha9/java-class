package methodInvoke;

public class MethodInvoke {
  static void method1() {
    System.out.println("This is method 1");
    method2();
  }

  static void method2() {
    System.out.println("This is method 2");
    try {
      method3();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.getMessage();
    }
  }

  static void method3() {
    Exception exc = new Exception("ERROR");
    throw exc;
    // System.out.println("This is method 3");
  }

  public static void main(String[] args) {
    method1();
  }
}
