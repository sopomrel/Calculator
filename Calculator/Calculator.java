package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String symbol = scanner.next();
        int num2 = scanner.nextInt();


        int result ;
        switch (symbol){
            case "+" :
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-" :
                result = num1 - num2;
                System.out.println(result);
                break;
            case "*" :
                 result = num1 * num2;
                System.out.println(result);
                break;
            case "/" :
                if(num2 != 0) {
                    double divisionResult = (double) num1 / num2;
                    System.out.println(divisionResult);
                }else{
                    throw new NullPointerException("can't divide  by zero");
                }
                break;
            default:
                System.out.println("invalid input");

        }

    }

}
