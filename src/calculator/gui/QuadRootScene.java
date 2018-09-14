package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class QuadRootScene {

    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderQuadRootsScene(Stage primaryStage){
        GridPane quadRootGrid = new GridPane();
        quadRootGrid.setHgap(10);
        quadRootGrid.setVgap(10);

        Label label = new Label("Quadratic Roots Finder");
        GridPane.setConstraints(label,0,0);

        Label label1 = new Label("Ax^2 + Bx + C");
        GridPane.setConstraints(label, 0, 1);

        TextField inputA = new TextField();
        inputA.setPromptText("Enter the value for A");
        GridPane.setConstraints(inputA, 0, 2);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter the value for B");
        GridPane.setConstraints(inputB,1,2 );

        TextField inputC = new TextField();
        inputC.setPromptText("Enter the value for C");
        GridPane.setConstraints(inputC, 2, 2);

        TextField output = new TextField();
        output.setPromptText("Output prints here");
        GridPane.setConstraints(output,1,4 );

        Button calc = new Button("Calculate the roots!");
        GridPane.setConstraints(calc,0,4 );

        calc.setOnAction(e-> {
            output.setText(QuadRootMethod.quadRootsMethod(Double.parseDouble(inputA.getText()),
                    Double.parseDouble(inputB.getText()),
                    Double.parseDouble(inputC.getText())));
        });

        quadRootGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA,
                inputB, inputC, output, label1, calc);
        Scene quadRootScene = new Scene(quadRootGrid, 600, 300);
        quadRootGrid.setAlignment(Pos.CENTER);
        setStyle.setStyleSheet(quadRootScene, primaryStage);
        return quadRootScene;


    }
}
