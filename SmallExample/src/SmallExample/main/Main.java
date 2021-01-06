package SmallExample.main;

import javafx.application.Application;
import javafx.stage.Stage;
import SmallExample.model.Model;
import SmallExample.model.ModelInterface;
import SmallExample.view.ViewHandler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ModelInterface model = new Model();
        ViewHandler viewHandler = new ViewHandler(model);
        viewHandler.start(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
