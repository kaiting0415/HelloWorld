import java.util.Scanner;
public class HelloWorld3{

 public static void main(String[] args){
 Scanner sc = new Scanner (System.in);
System.out.println("Enter rectangle length");
double length =sc.nextDouble();
System.out.println("Enter rectangle width");
double width =sc.nextDouble();
double perimeter =2*(length + width);
System.out.println("perimeter of rectangle=" + perimeter);
 sc.close();
 }
 }