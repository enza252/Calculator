package calculator.gui;

import java.text.DecimalFormat;

public class SqrtMethod {
    public static String sqrtMethod(Double a){
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        if (a < 0){
            Double b = a * -1;
            return String.valueOf(df.format(Math.sqrt(b)))+"i";
        }
        return String.valueOf(df.format(Math.sqrt(a)));
    }
}
