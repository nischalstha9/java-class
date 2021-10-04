package methodInvoke;

public class MethodInvoke {
  static void method1() {
    System.out.println("This is method 1");
    try {
    	method2();	
    }catch (Exception e){
		  System.out.println(e.getMessage());
	  }finally {
      System.out.println("Program finished");
    }
  }

  static void method2() throws Exception {
    System.out.println("This is method 2");
    method3();
  }

  static void method3() throws Exception {
    Exception exc = new Exception("This is error thrown from method3");
    throw exc;
  }

  public static void main(String[] args) {
    method1();
  }
}
