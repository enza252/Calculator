package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NrtScene {
    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderNthRootScene(Stage primaryStage){
        GridPane nthRootGrid = new GridPane();
        nthRootGrid.setHgap(10);
        nthRootGrid.setVgap(10);

        Label label = new Label("Entered Nth Root mode!!");
        GridPane.setConstraints(label, 0 ,0);

        Label label1 = new Label("N = root, A = your value");
        GridPane.setConstraints(label1, 0, 1);

        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for N");

        GridPane.setConstraints(inputA, 0, 2);

        Label plus = new Label("\troot");

        GridPane.setConstraints(plus,1,2);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter a value for A");
        GridPane.setConstraints(inputB, 2, 2);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,3);

        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,4);

        Button nrt = new Button("Calculate!");
        GridPane.setConstraints(nrt, 1,4);


        nrt.setOnAction(e -> {
            output.setText(NrtMethod.nrtMethod(Double.parseDouble(inputA.getText()), Double.parseDouble(inputB.getText())));
        });

        nthRootGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA,
                inputB, eqs, plus, output, nrt, label1);
        Scene nrtScene = new Scene(nthRootGrid, 600, 300);
        nthRootGrid.setAlignment(Pos.CENTER);
        setStyle.setStyleSheet(nrtScene, primaryStage);
        return nrtScene;
    }
}
