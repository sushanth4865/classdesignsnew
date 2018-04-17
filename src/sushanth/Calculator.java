package sushanth;

import java.util.Scanner;

/**
 * Created by kasir on 4/2/2018.
 */
public class Calculator {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        double inputA = 0; // taken as local variables since only used for this method
        double inputB = 0;
        String operator = null;

        double answer = 0;
        System.out.println("Enter first input");
        inputA = scanner.nextDouble();
        System.out.println("Enter second input");
        inputB = scanner.nextDouble();
        System.out.println("Enter operator");
        operator = scanner.next();
        Maths maths = new Maths();
        switch(operator){
            case "+":answer = maths.add(inputA,inputB);
            break;
            case "-":answer = maths.substract(inputA,inputB);
            break;
            case "*":answer = maths.multiply(inputA, inputB);
            break;
            case "/":answer = maths.divide(inputA,inputB);
            break;
        }
        System.out.println(answer);
        scanner.close();
    }
}
