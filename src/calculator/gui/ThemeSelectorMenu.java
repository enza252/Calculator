package calculator.gui;

import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;

public class ThemeSelectorMenu {

    private static SetStyle setStyle = new SetStyle();

    public Menu renderThemeSelector() {

        Menu themeMenu = new Menu("Theme");
        ToggleGroup themeToggle = new ToggleGroup();

        setStyle.getStyleSheet(1);

        RadioMenuItem darkTheme = new RadioMenuItem("Dark");
        darkTheme.setToggleGroup(themeToggle);
        darkTheme.setSelected(true);
        darkTheme.setOnAction(e-> setStyle.getStyleSheet(1));

        RadioMenuItem lightTheme = new RadioMenuItem("Light");
        lightTheme.setToggleGroup(themeToggle);
        lightTheme.setOnAction(e-> setStyle.getStyleSheet(2));


        themeMenu.getItems().addAll(darkTheme, lightTheme);

        return themeMenu;
    }

}
