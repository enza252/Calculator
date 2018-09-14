package calculator.gui;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonsClass {

    protected ButtonsClass(){}

    private static View theView = new View();

    public Button renderReturnButton(Stage primaryStage){
       Button returnToCalc = new Button();
        returnToCalc.setText("Return to Calculator");
        GridPane.setConstraints(returnToCalc, 0, 9);
        returnToCalc.setOnAction(e -> primaryStage.setScene(theView.renderCalcScene(primaryStage)));
        return returnToCalc;
    }

    private static AdditionScene addScene = new AdditionScene();

    public Button renderAddButton(Stage primaryStage){
        Button addButton = new Button("Addition");
        GridPane.setConstraints(addButton, 0, 0); // column=2 row=0
        addButton.setOnAction(e -> primaryStage.setScene(addScene.renderAddScene(primaryStage)));

        return addButton;
    }

    private static SubtractionScene subScene = new SubtractionScene();

    public Button renderSubButton(Stage primaryStage){
       Button subButton = new Button("Subtraction");
        GridPane.setConstraints(subButton,1,0);
        subButton.setOnAction(e-> primaryStage.setScene(subScene.renderSubScene(primaryStage)));
        return subButton;
    }

    private static DivisionScene divScene = new DivisionScene();

    public Button renderDivButton(Stage primaryStage){
       Button divButton = new Button("Division");
        GridPane.setConstraints(divButton, 2, 0);
        divButton.setOnAction(e-> primaryStage.setScene(divScene.renderDivScene(primaryStage)));
        return divButton;
    }

    private static ProductScene prodScene = new ProductScene();

    public Button renderProdButton(Stage primaryStage){
       Button prodButton = new Button("Multiplication");
        GridPane.setConstraints(prodButton, 3, 0);
        prodButton.setOnAction(e-> primaryStage.setScene(prodScene.renderProdScene(primaryStage)));
        return prodButton;
    }

    private static SinCosTanScene sctSceneClass = new SinCosTanScene();

    public Button renderSinCosTanButton(Stage primaryStage){
        Button sinCosTanButton = new Button("Sin, Cos, Tan");
        GridPane.setConstraints(sinCosTanButton, 4, 0);
        sinCosTanButton.setOnAction(e-> primaryStage.setScene(sctSceneClass.renderSinCosTanScene(primaryStage)));
        return sinCosTanButton;
    }

    private static RemainderScene remScene = new RemainderScene();

    public Button renderRemButton(Stage primaryStage) {
       Button remButton = new Button("Remainder");
        GridPane.setConstraints(remButton, 0 , 1);
        remButton.setOnAction(e-> primaryStage.setScene(remScene.renderRemainderScene(primaryStage)));
        return remButton;
    }

    private static ExponentScene eScene = new ExponentScene();

    public Button renderEButton(Stage primaryStage){
       Button eButton = new Button("Exponent");
        GridPane.setConstraints(eButton, 1, 1);
        eButton.setOnAction(e-> primaryStage.setScene(eScene.renderEScene(primaryStage)));
        return eButton;
    }

    private static NrtScene nRtScene = new NrtScene();

    public Button renderNRtButton(Stage primaryStage){
       Button nrtButton = new Button("Nth Root");
        GridPane.setConstraints(nrtButton, 2, 1);
        nrtButton.setOnAction(e-> primaryStage.setScene(nRtScene.renderNthRootScene(primaryStage)));
        return nrtButton;
    }

    private static SqrtScene sqrtScene = new SqrtScene();

    public Button renderSqrtButton(Stage primaryStage){
       Button sqrtButton = new Button("Square Root");
        GridPane.setConstraints(sqrtButton, 3, 1);
        sqrtButton.setOnAction(e-> primaryStage.setScene(sqrtScene.renderSqrtScene(primaryStage)));
        return sqrtButton;
    }

    private static ExponentialScene expScene = new ExponentialScene();

    public Button renderExponentialButton(Stage primaryStage){
       Button exponentialButton = new Button("Expontential");
        GridPane.setConstraints(exponentialButton, 4, 1);
        exponentialButton.setOnAction(e-> primaryStage.setScene(expScene.renderExponentialScene(primaryStage)));
        return exponentialButton;
    }

    private static QuadRootScene quadRoots = new QuadRootScene();

    public Button renderQuadRootsButton(Stage primaryStage){
       Button quadRootsButton = new Button("Quadratic Roots");
        GridPane.setConstraints(quadRootsButton, 2, 2);
        quadRootsButton.setOnAction(e-> primaryStage.setScene(quadRoots.renderQuadRootsScene(primaryStage)));
        return quadRootsButton;
    }



}
