import java.util.Scanner;

public class Uravnenie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a  = sc.nextDouble();
        double b  = sc.nextDouble();
        double c  = sc.nextDouble();
        quation(a,b,c);

    }

    public static void quation(double a,double b, double c ) {
        double D = (b * b) - (4 * a * c);
        if(D>0){
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Корни квадратного уравнения " + x1 + "    " + x2);
        }else if (D==0){
            double x = (-b)/(2*a);
            System.out.println("Корень квадратного уравнения" + x);
        }else if (D<0){
            System.out.println("Решения не существует");
        }
    }
}
