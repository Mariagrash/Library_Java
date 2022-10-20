import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = scan.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = scan.nextInt();
        CalculationSum a= new CalculationSum();
        System.out.println("Addition");
        System.out.println(a. add(numberOne, numberTwo));
        CalculationSubtract b= new CalculationSubtract();
        System.out.println("Subraction");
        System.out.println(b.minus(numberOne, numberTwo));
        CalculationMultiply c= new CalculationMultiply();
        System.out.println("Multiplication");
        System.out.println(c.multiply(numberOne, numberTwo));
        CalculationDivision d= new CalculationDivision();
        System.out.println("Division");
        System.out.println(d. divide(numberOne, numberTwo));
        CalculationModulo e= new CalculationModulo();
        System.out.println("Modulo");
        System.out.println(e. percentage(numberOne, numberTwo));
    }
    
}

