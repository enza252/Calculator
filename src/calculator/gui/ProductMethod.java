package calculator.gui;

import java.text.DecimalFormat;

public class ProductMethod {
    public static String prodMethod(Double a, Double b){
        DecimalFormat df = new DecimalFormat(View.dfPattern);
        return String.valueOf(df.format(a*b));
    }
}
