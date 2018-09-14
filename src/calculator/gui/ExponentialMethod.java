package calculator.gui;

import java.text.DecimalFormat;

public class ExponentialMethod {
    public static String expMethod(Double a) {
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        return String.valueOf(df.format(Math.pow(Math.E, a)));
    }

}
