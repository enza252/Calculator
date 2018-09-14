package calculator.gui;

import java.text.DecimalFormat;

public class ExponentMethod {
    public static String exponentMethod(Double a, Double b){
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        if (a==0 && b==0){
            return "1";
        }
        return String.valueOf(df.format(Math.pow(a, b)));}
}
