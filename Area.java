import  java.util.Scanner;
public class Area{
  public static void main(String[]args){
    Scanner square =new Scanner(System.in);
    double pie=3.1416;
    System.out.println("enter the value of radius:");
    int radius=square.nextInt();
    System.out.println("the value of radius is:" + radius);
    System.out.println("the area is :" + pie*radius*radius);
    System.out.println("the value of circumfrence is ;" + 2*pie*radius);
  }
}