import java.util.Scanner;
public class Pounds{
    public static void main(String[]args){
    Scanner weight=new Scanner(System.in); 
    double pounds=2.2;
    System.out.println("enter weight in pound:");
    double pound=weight.nextDouble();
    System.out.println("the weight in pound is:");
    System.out.println("the value in kilogram is:" +pound/pounds);
    }
}