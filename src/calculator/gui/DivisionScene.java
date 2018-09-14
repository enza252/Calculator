package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DivisionScene {
    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderDivScene(Stage primaryStage){
        GridPane divSceneGrid = new GridPane();
        divSceneGrid.setHgap(10);
        divSceneGrid.setVgap(10);

        Label label = new Label("Entered division mode!!");

        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for A");

        GridPane.setConstraints(inputA, 0, 2);

        Label plus = new Label("\t/");

        GridPane.setConstraints(plus,0,3);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter a value for B");

        Label label2 = new Label("Note: B cannot = 0");
        GridPane.setConstraints(label2,1, 4);

        GridPane.setConstraints(inputB, 0, 4);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,5);

        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,6);

        Button div = new Button("Divide!");
        GridPane.setConstraints(div, 1,6);


        div.setOnAction(e -> {
            output.setText(DivisionMethod.divMethod(Double.parseDouble(inputA.getText()), Double.parseDouble(inputB.getText())));
        });

        divSceneGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA, inputB, eqs, plus, output, div);
        Scene divScene = new Scene(divSceneGrid, 600, 300);
        setStyle.setStyleSheet(divScene, primaryStage);
        divSceneGrid.setAlignment(Pos.CENTER);
        return divScene;
    }
}
