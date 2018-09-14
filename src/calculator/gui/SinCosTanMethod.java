package calculator.gui;

import java.text.DecimalFormat;

public class SinCosTanMethod {

    public String sinCosTanMethod(Double a, String whatFunction, String whatAngle){

        DecimalFormat df = new DecimalFormat(View.dfPattern);


        int x;

        if (whatAngle == "Degrees"){
            x = 0;
        } else if (whatAngle == "Radians") {
            x = 1; // Choose Radians
        }
        else x = 2;

        if (x == 0) {
            if (whatFunction == "Tangent") {
                return String.valueOf(df.format(Math.tan(a)));
            } else if (whatFunction == "Arctan") {
                return String.valueOf(df.format(Math.toDegrees(Math.atan(a))));
            } else if (whatFunction == "Cosine") {
                return String.valueOf(df.format(Math.cos(a)));
            } else if (whatFunction == "Arccos") {
                return String.valueOf(df.format(Math.toDegrees(Math.acos(a))));
            } else if (whatFunction == "Sine") {
                return String.valueOf(df.format(Math.sin(a)));
            }
            return String.valueOf(df.format(Math.toDegrees(Math.asin(a))));
        }

        else if (x == 1) {
            if (whatFunction == "Tangent") {
                return String.valueOf(df.format(Math.tan(a)));
            } else if (whatFunction == "Arctan") {
                return String.valueOf(df.format(Math.atan(a)));
            } else if (whatFunction == "Cosine") {
                return String.valueOf(df.format(Math.cos(a)));
            } else if (whatFunction == "Arccos") {
                return String.valueOf(df.format(Math.acos(a)));
            } else if (whatFunction == "Sine") {
                return String.valueOf(df.format(Math.sin(a)));
            }
            return String.valueOf(df.format(Math.asin(a)));

        }
        else if ( x > 1) {
            return "Invalid input";
        }
        return "Invalid input";

    }
}
