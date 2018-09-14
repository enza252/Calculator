package calculator.gui;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class FileMenu {

    public Menu renderFileMenu(){
        Menu fileMenu = new Menu("File");
        MenuItem quitItem = new MenuItem("Quit");
        quitItem.setOnAction(e-> Platform.exit());
        fileMenu.getItems().add(quitItem);
        return fileMenu;
    }
}
