package calculator.gui;

import java.text.DecimalFormat;

public class AddMethod {

//    View view = new View();

    public static String addMethod(Double a, Double b) {

        DecimalFormat df = new DecimalFormat(View.dfPattern);

        return String.valueOf(df.format(a+b));
    }
}
