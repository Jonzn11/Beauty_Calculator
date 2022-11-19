import java.util.Scanner;

public class Beauty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Data for beauty

        System.out.println(" What is your bust size?");
        double bust = scanner.nextDouble();

        System.out.println("What is your hip size?");
        double hip = scanner.nextDouble();

        System.out.println("What is your waist size?");
        double waist = scanner.nextDouble();

        System.out.println("What is your height in centimeters?");
        double height = scanner.nextDouble();

        System.out.println("What is your weight in kilograms?");
        double weight = scanner.nextDouble();

        double waistMath = Math.pow(waist, 2);
        double result = ( bust * hip * height ) / (waistMath * weight);
        System.out.print(result);



    }
}
