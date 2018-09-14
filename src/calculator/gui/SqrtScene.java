package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SqrtScene {

    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderSqrtScene(Stage primaryStage){
        GridPane sqrtSceneGrid = new GridPane();
        sqrtSceneGrid.setVgap(10);
        sqrtSceneGrid.setHgap(10);
        Label label = new Label("Square root mode");

        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value");

        GridPane.setConstraints(inputA, 0, 2);
        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,3);


        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,4);

        Button sqrt = new Button("Find the square root!");
        GridPane.setConstraints(sqrt, 1,4);

        sqrt.setOnAction(e -> {
            output.setText(SqrtMethod.sqrtMethod(Double.parseDouble(inputA.getText())));
        });

        sqrtSceneGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA, eqs, output, sqrt);
        Scene sqrtScene = new Scene(sqrtSceneGrid, 600, 300);
        sqrtSceneGrid.setAlignment(Pos.CENTER);
        setStyle.setStyleSheet(sqrtScene, primaryStage);
        return sqrtScene;

    }
}
