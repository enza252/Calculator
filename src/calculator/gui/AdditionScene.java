package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AdditionScene {

    public AdditionScene(){}

    private static ButtonsClass renderButtons = new ButtonsClass();

    private static SetStyle setStyle = new SetStyle();

    public Scene renderAddScene(Stage primaryStage){


        GridPane addSceneGrid = new GridPane();
        addSceneGrid.setVgap(10);
        addSceneGrid.setHgap(10);

        Label label = new Label("Entered Addition Mode!!");
        GridPane.setConstraints(label, 0 , 0);


        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for A");
        GridPane.setConstraints(inputA, 0, 2);

        Label plus = new Label("\t+");

        GridPane.setConstraints(plus,0,3);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter a value for B");


        GridPane.setConstraints(inputB, 0, 4);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,5);

        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,6);

        Button sum = new Button("Sum!");
        GridPane.setConstraints(sum, 1,6);

        sum.setOnAction(e -> {
            output.setText(AddMethod.addMethod(Double.parseDouble(inputA.getText()), Double.parseDouble(inputB.getText())));
        });

        addSceneGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA, inputB, eqs, plus, output, sum);
       Scene addScene = new Scene(addSceneGrid, 600, 300);
        setStyle.setStyleSheet(addScene, primaryStage);
        addSceneGrid.setAlignment(Pos.CENTER);
        return  addScene;

    }
}
