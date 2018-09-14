package calculator.gui;

import java.text.DecimalFormat;

public class NrtMethod {
    public static String nrtMethod(Double a, Double b){
        DecimalFormat df = new DecimalFormat(View.dfPattern);

        return String.valueOf(df.format(Math.pow(b, 1/a)));
    }
}
