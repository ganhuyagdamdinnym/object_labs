import java.util.Scanner;
import java.lang.Math;

public class bodlogo3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter cathetus:");
        
        double cat1 = input.nextFloat();
        double cat2 =input.nextFloat();
        // double gip=Math.sqrt(cat1*cat1+cat2*cat2);
         double gip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2, 2));
        System.out.println("gip"+gip);

        input.close();
    }
}
