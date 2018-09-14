package calculator.gui;

import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;

public class MenuController {

    private VBox root;

    private static ViewMenu viewMenu = new ViewMenu();

    private static FileMenu fileMenu = new FileMenu();

    private static ThemeSelectorMenu themeSelector = new ThemeSelectorMenu();

    public Scene menuControllerMethod(){
        MenuBar mainMenuBar = new MenuBar();
        mainMenuBar.setUseSystemMenuBar(true);
        root = new VBox(mainMenuBar);
        mainMenuBar.getMenus().addAll(fileMenu.renderFileMenu(), viewMenu.renderViewMenu(),
                themeSelector.renderThemeSelector());
        Scene menuTop = new Scene(root, 600, 300);
        return menuTop;

    }
}
