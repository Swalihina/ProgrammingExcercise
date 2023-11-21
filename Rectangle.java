import java.util.Scanner;
public class Rectangle{
    public static void main(String[]args){
        Scanner area=new Scanner(System.in);
        System.out.println("enter the value of length:");
        float length=area.nextFloat();
        System.out.println("the value of length is:"+length);
        
        System.out.println("enter the value of width:");
        float width=area.nextFloat();
        System.out.println("the value of width is:"+width);
        System.out.println("the area of rectangle is :" +length*width);
        System.out.println("the parameter of rectangle is :"+2*(length+width));

    }
}