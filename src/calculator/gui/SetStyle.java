package calculator.gui;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SetStyle {

    private static String theme = "";


    public void getStyleSheet(int num){

        switch (num){
            case 1:
                theme = "resources/DarkTheme.css";
                break;
            case 2:
                theme = "resources/LightTheme.css";
                break;
            default:
                theme = "resources/DarkTheme.css";
                break;
        }
    }

    public void setStyleSheet(Scene scene, Stage pStage){


//        if (scene.getStylesheets().size() > 0) {
//            scene.getStylesheets().remove(0);
//        }
//
//        scene.new View())


        scene.getStylesheets().add(getClass().getResource(theme).toString());
        pStage.setScene(scene);

    }
}
