import java.util.Scanner;

public class bodlogo4 {

    public static double trapezoidArea(double a, double b, double alpha) {

        double rad = Math.toRadians(alpha);
        double h = ((a - b) / 2) * Math.tan(rad);
        double S = ((a + b) / 2) * h;
        return S;
    }

    public static void main(String[] args) {

        
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter a,b alpha:");
        double a = scanner.nextFloat();
        double b =scanner.nextFloat();
        double alpha=scanner.nextFloat();
        double area = trapezoidArea(a, b, alpha);
        System.out.println("Talbai: " + area);

        scanner.close();
    }
}