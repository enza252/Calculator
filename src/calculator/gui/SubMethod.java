package calculator.gui;

import java.text.DecimalFormat;

public class SubMethod {

    public static String subMethod(Double a, Double b){
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        return String.valueOf(df.format(a-b));
    }

}
