import java.util.Scanner;

public class complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Real and Imaginary part for Number 1:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.println("Enter Real and Imaginary part for Number 2:");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        double sumReal = r1 + r2;
        double sumImag = i1 + i2;

        System.out.println("The sum is: " + sumReal + " + " + sumImag + "i");
        
        sc.close();
    }
}
