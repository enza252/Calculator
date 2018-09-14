package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProductScene {
    private static ButtonsClass renderButtons = new ButtonsClass();
    private static SetStyle setStyle = new SetStyle();

    public Scene renderProdScene(Stage primaryStage){
        GridPane prodSceneGrid = new GridPane();
        prodSceneGrid.setHgap(10);
        prodSceneGrid.setVgap(10);

        Label label = new Label("Entered multiply mode!!");

        TextField inputA = new TextField();
        inputA.setPromptText("Enter a value for A");

        GridPane.setConstraints(inputA, 0, 2);

        Label plus = new Label("\tx");

        GridPane.setConstraints(plus,0,3);

        TextField inputB = new TextField();
        inputB.setPromptText("Enter a value for B");

        GridPane.setConstraints(inputB, 0, 4);

        Label eqs = new Label("\t=");
        GridPane.setConstraints(eqs,0,5);

        TextField output = new TextField();
        output.setPromptText("Answer prints here");
        GridPane.setConstraints(output, 0,6);

        Button prod = new Button("Multiply!");
        GridPane.setConstraints(prod, 1,6);


        prod.setOnAction(e -> {
            output.setText(ProductMethod.prodMethod(Double.parseDouble(inputA.getText()), Double.parseDouble(inputB.getText())));
        });

        prodSceneGrid.getChildren().addAll(label, renderButtons.renderReturnButton(primaryStage), inputA, inputB, eqs, plus, output, prod);
       Scene prodScene = new Scene(prodSceneGrid, 600, 300);
       prodSceneGrid.setAlignment(Pos.CENTER);
       setStyle.setStyleSheet(prodScene, primaryStage);
       return prodScene;


    }
}
