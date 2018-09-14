package calculator.gui;

import java.text.DecimalFormat;

public class RemainderMethod {

    public static String remMethod(Double a, Double b) {
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        if (b == 0) {
            return "B cannot equal 0";
        }
        return String.valueOf(df.format(a%b));
    }
}
