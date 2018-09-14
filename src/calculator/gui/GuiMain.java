package calculator.gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class GuiMain extends Application {

    public GuiMain(){}

    Stage window;

    View theView = new View();


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        theView.renderTopMenu(window);
        theView.renderStageAndMainScene(window);

    }

}
