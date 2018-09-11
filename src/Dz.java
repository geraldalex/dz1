import java.util.Scanner;

public class Dz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int value = sc.nextInt();
         int grade = sc.nextInt();
        double a = pow(value,grade);
        System.out.println(a);

    }

    public static double pow(int value, int grade){
        return Math.pow(value, grade);

    }
}
