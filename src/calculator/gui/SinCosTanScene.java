package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SinCosTanScene {

    private static ButtonsClass renderButtons = new ButtonsClass();

    private static SinCosTanMethod sctMethod = new SinCosTanMethod();

    private static SetStyle setStyle = new SetStyle();


    public Scene renderSinCosTanScene(Stage primaryStage){
        GridPane sinCosTanGrid = new GridPane();
        sinCosTanGrid.setVgap(10);
        sinCosTanGrid.setHgap(10);
        Label label = new Label("Sine, Cosine and Tangent of Angles");
        GridPane.setConstraints(label,0,0);

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Sine", "Cosine", "Tangent", "Arcsine", "Arccos", "Arctan");
        choiceBox.setValue("Sine");
        GridPane.setConstraints(choiceBox, 0, 2);

        ChoiceBox<String> angle = new ChoiceBox<>();
        angle.getItems().addAll("Degrees", "Radians");
        angle.setValue("Degrees");
        GridPane.setConstraints(angle, 1, 1);

        Label label1 = new Label("Select units");
        GridPane.setConstraints(label1,1, 0);
        TextField inputA = new TextField();
        inputA.setPromptText("Input");
        GridPane.setConstraints(inputA, 1, 2);

        Button calc = new Button("Calculate!");
        GridPane.setConstraints(calc, 2,4);

        TextField output = new TextField();
        output.setPromptText("Outputs here");
        GridPane.setConstraints(output, 1,4);

        Label label2 = new Label("Sin, Cos, Tan (x) output in radians");
        GridPane.setConstraints(label2, 0, 4);

        calc.setOnAction(e-> output.setText(sctMethod.sinCosTanMethod(Double.parseDouble(inputA.getText()),
                choiceBox.getValue(), angle.getValue())));

        sinCosTanGrid.getChildren().addAll(label,label1, choiceBox, calc,
                inputA, output, renderButtons.renderReturnButton(primaryStage), angle, label2);

        Scene sctScene = new Scene(sinCosTanGrid, 600, 300);
        sinCosTanGrid.setAlignment(Pos.CENTER);
        setStyle.setStyleSheet(sctScene, primaryStage);
        return sctScene;
    }
}
