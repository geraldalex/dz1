public class Dz1 {
    public static void main(String[] args) {

    }

    public static void quation(double a,double b, double c ) {
        double D = (b * b) - (4 * a * c);
        if(D>0){
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Корни квадратного уравнения" + x1 + " " + x2);
        }else if (D==0){
            double x = (-b)/(2*a);
            System.out.println("Корень квадратного уравнения" + x);
        }else if (D<0){
            System.out.println("Решения не существует");
        }
    }
}
