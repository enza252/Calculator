package calculator.gui;

public class UserDecimalFormat {

    public void setDecimals(String numberOfDecimals){

        int i = Integer.parseInt(numberOfDecimals); // Convert input text to int for control in switch statement

        String x;

        switch (i) {
            case 1:
                x = "#.#";
                break;
            case 2:
                x = "#.##";
                break;
            case 3:
                x = "#.###";
                break;
            case 4:
                x = "#.####";
                break;
            case 5:
                x = "#.#####";
                break;
            case 6:
                x = "#.######";
                break;
            case 7:
                x = "#.#######";
                break;
            default:
                x = "#.###";
                break;
        }
        setDfPattern(x);
    }

    public static void setDfPattern(String dfPattern) {
        View.dfPattern = dfPattern;
    }
}
