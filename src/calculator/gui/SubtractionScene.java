package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SubtractionScene {

    public SubtractionScene(){}

    private ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();


    public Scene renderSubScene(Stage primaryStage){

        GridPane subSceneGrid = new GridPane();

        subSceneGrid.setVgap(10);
        subSceneGrid.setHgap(10);

        Label label = new Label("Entered Subtraction Mode!!");
        GridPane.setConstraints(label, 0 , 0);


        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for A");
        GridPane.setConstraints(inputA, 0, 2);

        Label plus = new Label("\t-");

        GridPane.setConstraints(plus,0,3);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter a value for B");


        GridPane.setConstraints(inputB, 0, 4);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,5);

        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,6);

        Button sub = new Button("Subtract!");
        GridPane.setConstraints(sub, 1,6);

        sub.setOnAction(e -> {
            output.setText(SubMethod.subMethod(Double.parseDouble(inputA.getText()), Double.parseDouble(inputB.getText())));
        });

        subSceneGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA, inputB, eqs, plus, output, sub);
        Scene subScene =  new Scene(subSceneGrid, 600, 300);
        subSceneGrid.setAlignment(Pos.CENTER);
        setStyle.setStyleSheet(subScene, primaryStage);
        return subScene;
    }
}
