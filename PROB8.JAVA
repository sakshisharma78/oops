public class VariableAndMethodExample { 
    private static int num1 = 10; 
    private int num2 = 5; 
    public static void main(String[] args) 
    { 
    VariableAndMethodExample obj1 = new VariableAndMethodExample(); 
    VariableAndMethodExample obj2 = new VariableAndMethodExample(); 
   
    obj1.num1 = 20; 
    obj1.num2 = 15; 
    obj2.num2 = 30; 
    int result1 = obj1.calculateSum(); 
    int result2 = obj2.calculateSum(); 
    System.out.println("Result 1: " + result1); 
    System.out.println("Result 2: " + result2); 
    } 
    private int calculateSum() 
    { 
    return num1 + num2; 
    } 
   } 
   