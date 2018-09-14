package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExponentialScene {

    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderExponentialScene(Stage primaryStage){
        GridPane exponentialSceneGrid = new GridPane();

        exponentialSceneGrid.setVgap(10);
        exponentialSceneGrid.setHgap(10);

        Label label = new Label("Entered Exponential Mode!!");
        GridPane.setConstraints(label, 0 , 0);

        Label label1 = new Label("Follows the format: e^A");
        GridPane.setConstraints(label1, 0, 1);

        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for A");
        GridPane.setConstraints(inputA, 0, 2);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,3);


        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,4);

        Button exp = new Button("Find the exponential!");
        GridPane.setConstraints(exp, 1,4);

        exp.setOnAction(e -> {
            output.setText(ExponentialMethod.expMethod(Double.parseDouble(inputA.getText())));
        });

        exponentialSceneGrid.getChildren().addAll(label,label1, renderButtons.renderReturnButton(primaryStage), inputA, eqs, output, exp);
        Scene expScene =  new Scene(exponentialSceneGrid, 600, 300);
        setStyle.setStyleSheet(expScene, primaryStage);
        exponentialSceneGrid.setAlignment(Pos.CENTER);
        return expScene;
    }
}
