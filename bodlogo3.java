import java.util.Scanner;
import java.lang.Math;


public class bodlogo3 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter cathetes");

        double cath1=input.nextDouble();
        double cath2=input.nextDouble();

        double hyp=Math.sqrt(Math.pow(cath1, 2)+Math.pow(cath2, 2));


        System.out.print(hyp);

        input.close();

    }
}
