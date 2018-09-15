package calculator.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {

    public View(){}

    private static ButtonsClass renderButtons = new ButtonsClass();

    private static UserDecimalFormat uDF = new UserDecimalFormat();

    private static MenuController menuController = new MenuController();

    private static SetStyle setStyle = new SetStyle();

    public static String dfPattern= "";

    private Scene mainScene;



//Main Scene
    public void renderStageAndMainScene(Stage primaryStage){
        renderCalcScene(primaryStage);
        uDF.setDecimals("3");
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Ian's Calculator");
        primaryStage.show();

    }

    public Scene renderCalcScene(Stage primaryStage){
        GridPane mainGridPane = new GridPane();
        mainGridPane.getChildren().addAll( renderButtons.renderAddButton(primaryStage),
                renderButtons.renderSubButton(primaryStage), renderButtons.renderDivButton(primaryStage),
                renderButtons.renderProdButton(primaryStage), renderButtons.renderSqrtButton(primaryStage),
                renderButtons.renderEButton(primaryStage), renderButtons.renderExponentialButton(primaryStage),
                renderButtons.renderNRtButton(primaryStage), renderButtons.renderQuadRootsButton(primaryStage),
                renderButtons.renderSinCosTanButton(primaryStage), renderButtons.renderRemButton(primaryStage));
        mainGridPane.setHgap(10);
        mainGridPane.setVgap(10);
        mainGridPane.setAlignment(Pos.CENTER);
        mainScene = new Scene(mainGridPane, 800, 300);
        setStyle.setStyleSheet(mainScene, primaryStage);
        return mainScene;
    }

    public void renderTopMenu(Stage primaryStage){
        primaryStage.setScene(menuController.menuControllerMethod());
        primaryStage.show();
    }
}