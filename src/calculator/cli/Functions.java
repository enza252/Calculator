package calculator.cli;

import java.util.Scanner;

public class Functions extends MyInterfaces {

    public Functions(){

    }

    protected static void exponentialMe(){
        System.out.println("You have entered exponential mode, enter your value for the exponent of e");
        Scanner dc = new Scanner(System.in);
        double dbl = dc.nextDouble();
        MyInterfaces.calcLambda exponential = (x, y) -> Math.pow(x, y);
        System.out.println("The value of " + dbl + " to the power of e (e^" + dbl +  ") is " + exponential.calc(Math.E, dbl));
    }

    protected static void nthRootMe() {
        System.out.println("You have entered nth root mode");
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter a number that you with to find the nth root of");
        double dbl1 = dc.nextDouble();
        System.out.println("Enter your value for n");
        double n = dc.nextDouble();

        MyInterfaces.calcLambda nthRoot = (x, y) -> Math.pow(x, 1/y);
        System.out.println("The value of " + n + " root(" + dbl1 + ") is " + nthRoot.calc(dbl1, n));
    }

    protected static void exponentMe(){
        System.out.println("You have entered **power** mode!\n Enter your number followed by your desired exponent");
        Scanner sc = new Scanner(System.in);
        double dbl = sc.nextDouble();
        System.out.println("Enter your exponent");
        double exponent = sc.nextDouble();

        MyInterfaces.calcLambda exponential = (x, y) -> Math.pow(x, y);
        System.out.println("The value of " + dbl + " to the power of " + exponent + " is " + exponential.calc(dbl, exponent));

    }

    protected static void sqrootMe(){
        System.out.println("You have entered square root mode");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square root");
        double dbl = sc.nextDouble();
        if (dbl == 0){
            System.out.println("The sqroot of 0 is 0");
        }
        MyInterfaces.singleLambda sqroot = (x) -> Math.sqrt(x);
        System.out.println("The sqroot of " + dbl + " is " + sqroot.calc(dbl));
    }

    protected static void remainderMe(){
        System.out.println("You have entered remainder mode");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double dbl1 = sc.nextDouble();
        System.out.println("Enter another number - note: you cannot divide by zero!");
        double dbl2 = sc.nextDouble();
        if (dbl2 == 0 ){
            System.err.println("You cannot divide by zero! Enter a non-zero value");
        } else {
            MyInterfaces.calcLambda remainder = (x, y) -> x % y;
            System.out.println("The remainder of " + dbl1 + " divided by " + dbl2 + " is " + remainder.calc(dbl1, dbl2));
        }


    }

    protected static void subtractMe(){
        System.out.println("You have entered subtract mode");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double dbl1 = sc.nextDouble();
        System.out.println("Enter a number");
        double dbl2 = sc.nextDouble();
        MyInterfaces.calcLambda subtract = (x, y) -> x - y;
        System.out.println(dbl1 + " subtracted from " + dbl2 + " is " + subtract.calc(dbl1, dbl2));
    }


    protected static void divideMe(){
        System.out.println("You have entered divide mode");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double dbl1 = sc.nextDouble();
        System.out.println("Enter another number - note: you cannot divide by zero!");
        double dbl2 = sc.nextDouble();
        if (dbl2 == 0){
            System.err.println("You cannot divide by zero! Enter a non-zero value...");
        } else {
            MyInterfaces.calcLambda divide = (x, y) -> x/y;
            System.out.println("The division of " + dbl1 + " and " + dbl2 + " yields " + divide.calc(dbl1, dbl2));
        }
    }

    protected static void multiplyMe() {
        System.out.println("You have entered multiplication mode");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double dbl1 = sc.nextDouble();
        System.out.println("Enter another number");
        double dbl2 = sc.nextDouble();
        MyInterfaces.calcLambda multiply = (x, y) -> x * y;
        System.out.println("The product of " + dbl1 + " and " + dbl2 + " is " + multiply.calc(dbl1, dbl2));
    }

    protected static void addMe() {
        System.out.println("You have entered addition mode");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double dbl1 = sc.nextDouble();
        System.out.println("Enter another number:");
        double dbl2 = sc.nextDouble();

        MyInterfaces.calcLambda addition = (x, y) -> x + y;

        System.out.println("The sum of " + dbl1 + " " + dbl2 + " is " + addition.calc(dbl1, dbl2));
    }


}
