package calculator.gui;

import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;

public class ViewMenu {

    private static UserDecimalFormat uDF = new UserDecimalFormat();


    public Menu renderViewMenu(){
//        Render
        Menu viewMenu = new Menu("Decimals");
        ToggleGroup decimalToggle = new ToggleGroup();
//      Radio Menu Items one -> seven (1 -> 7 decimals)
        RadioMenuItem one = new RadioMenuItem("1");
        one.setToggleGroup(decimalToggle);
        one.setOnAction(e-> uDF.setDecimals(one.getText()));

        RadioMenuItem two = new RadioMenuItem("2");
        two.setToggleGroup(decimalToggle);
        two.setOnAction(e-> uDF.setDecimals(two.getText()));

        RadioMenuItem three = new RadioMenuItem("3");
        three.setToggleGroup(decimalToggle);
        three.setOnAction(e-> uDF.setDecimals(three.getText()));

        RadioMenuItem four = new RadioMenuItem("4");
        four.setToggleGroup(decimalToggle);
        four.setOnAction(e-> uDF.setDecimals(four.getText()));

        RadioMenuItem five = new RadioMenuItem("5");
        five.setToggleGroup(decimalToggle);
        five.setOnAction(e-> uDF.setDecimals(five.getText()));

        RadioMenuItem six = new RadioMenuItem("6");
        six.setToggleGroup(decimalToggle);
        six.setOnAction(e-> uDF.setDecimals(six.getText()));

        RadioMenuItem seven = new RadioMenuItem("7");
        seven.setToggleGroup(decimalToggle);
        seven.setOnAction(e-> uDF.setDecimals(seven.getText()));

        three.setSelected(true);

        viewMenu.getItems().addAll(one, two, three, four, five,
                six, seven);
        return viewMenu;
    }
}
