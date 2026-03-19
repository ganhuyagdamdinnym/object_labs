import java.util.Scanner;
import java.lang.Math;

public class bodlogo4 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a=");
        double a=input.nextDouble();

        System.out.print("enter b=");
        double b=input.nextDouble();

        System.out.print("enter alpha=");
        double alpha=input.nextDouble();
        
        double rad=Math.toRadians(alpha);
        double h=(a-b)*Math.tan(rad);

        double s=((a+b)/2)*h;

        System.out.println(s);
        input.close();
    }
}