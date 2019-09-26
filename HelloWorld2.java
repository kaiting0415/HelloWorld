import java.util.Scanner;
public class HelloWorld2{

 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number in mile=");
 double mile =sc.nextDouble();
 double kilometer=mile*1.609;
 System.out.println("The number in kilometer=" +kilometer);
 sc.close();
 }
 }