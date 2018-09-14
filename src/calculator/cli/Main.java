package calculator.cli;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Functions functions = new Functions();

        System.out.println("Welcome to the calculator!\n" +
                "Enter 0 -\tenters addition mode\n" +
                "Enter 1 -\tenters subtraction mode\n"+
                "Enter 2 -\tenters multiplication mode\n" +
                "Enter 3 -\tenters division mode\n" +
                "Enter 4 -\tenters remainder mode\n" +
                "Enter 5 -\tenters square root mode\n" +
                "Enter 6 -\tenters exponent mode (n to the power of m)\n" +
                "Enter 7 -\tenters nth root mode\n" +
                "Enter 8 -\tenters exponential (e to the power of n) mode");

        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()){
            case 0:
                functions.addMe();
                break;
            case 1:
                functions.subtractMe();
                break;
            case 2:
                functions.multiplyMe();
                break;
            case 3:
                functions.divideMe();
                break;
            case 4:
                functions.remainderMe();
                break;
            case 5:
                functions.sqrootMe();
                break;
            case 6:
                functions.exponentMe();
                break;
            case 7:
                functions.nthRootMe();
                break;
            case 8:
                functions.exponentialMe();
                break;
            default:
                System.out.println("No mode selected");
                break;
        }


    }
}
