package CalculatorModel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorMain extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Calculator.fxml"));
        Parent root = loader.load();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = loader.getController();
        controller.setModel(model);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
