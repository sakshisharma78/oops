public class prob6 
{ 
 int length; 
 int width; 
 public int calculateArea() { 
 return length * width; 
 } 
 public void displayDetails() 
 { 
 System.out.println("prob6 Length: " + length); 
 System.out.println("prob6 Width: " + width); 
 System.out.println("prob6 Area: " + calculateArea()); 
 } 
 public static void main(String[] args) 
 { 
 prob6 prob6 = new prob6(); 
 prob6.length = 5; 
 prob6.width = 10; 
 prob6.displayDetails(); 
 } 
}{

}
