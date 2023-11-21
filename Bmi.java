import java.util.Scanner;
public class Bmi{
    public static void main(String[]args){
        System.out.println("enter the value of your height:");
        Scanner person=new Scanner(System.in);
        float height=person.nextFloat();
        System.out.println("the value of height is:" + height);
        System.out.println("enter the value of your mass:");
        float mass=person.nextFloat();
        System.out.println("the value of your mass is:"+ mass);
        System.out.println("the person Bmi is :" + (mass/(height*height)));

    }
}