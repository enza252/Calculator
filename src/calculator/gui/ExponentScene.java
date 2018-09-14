package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExponentScene {

    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderEScene(Stage primaryStage){
        GridPane eSceneGrid = new GridPane();

        eSceneGrid.setVgap(10);
        eSceneGrid.setHgap(10);

        Label label = new Label("Entered Exponent Mode!!");
        GridPane.setConstraints(label, 0 , 0);

        Label label1 = new Label("Follows the format: A^B");
        GridPane.setConstraints(label1, 0, 1);

        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for A");
        GridPane.setConstraints(inputA, 0, 2);

        Label plus = new Label("\t^");

        GridPane.setConstraints(plus,0,3);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter a value for B");


        GridPane.setConstraints(inputB, 0, 4);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,5);

        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,6);

        Button ebtn = new Button("Calculate!");
        GridPane.setConstraints(ebtn, 1,6);

        ebtn.setOnAction(e -> {
            output.setText(ExponentMethod.exponentMethod(Double.parseDouble(inputA.getText()), Double.parseDouble(inputB.getText())));
        });

        eSceneGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA, inputB, eqs, plus, output, ebtn, label1);
        Scene eScene =  new Scene(eSceneGrid, 600, 300);
        eSceneGrid.setAlignment(Pos.CENTER);
        setStyle.setStyleSheet(eScene, primaryStage);
        return eScene;
    }
}
