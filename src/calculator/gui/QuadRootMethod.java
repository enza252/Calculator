package calculator.gui;

import java.text.DecimalFormat;

public class QuadRootMethod {
    public static String quadRootsMethod(Double a, Double b, Double c){
        double x = ((-1*b + (Math.sqrt((b*b) + ((-1) * (4) * (a) * (c)))))/(2*a));
        double y = ((-1*b - (Math.sqrt((b*b) + ((-1) * (4) * (a) * (c)))))/(2*a));
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        return "The roots are " + String.valueOf(df.format(x)) + ", " + String.valueOf(df.format(y));
    }
}
