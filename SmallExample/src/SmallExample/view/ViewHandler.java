package SmallExample.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import SmallExample.model.ModelInterface;

import java.io.IOException;

public class ViewHandler
{

  private Scene currentScene;
  private Stage primaryStage;
  private DataObjectWindowController dataObjectWindowController;
  private MainWindowController mainWindowController;

  private ModelInterface model;

  public ViewHandler(ModelInterface model) throws IOException {
    this.model = model;
    currentScene = new Scene(new Region());

    //Initialize all the ViewControllers (this is different from previous example where they would be initialized when first used. Here we batch-initialize everything instead.
    //This needs to be done for every controller
    FXMLLoader loader;
    Region root;

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("MainWindow.fxml"));
    root = loader.load();
    mainWindowController = loader.getController();
    mainWindowController.init(this, model, root);

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("DataObjectWindow.fxml"));
    root = loader.load();
    dataObjectWindowController = loader.getController();
    dataObjectWindowController.init(this, model, root);
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("MainWindow");
  }

  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "MainWindow":
        root = loadViewMainWindow();
        break;
      case "DataObjectWindow":
        root = loadViewDataObjectWindow();
        break;
    }
    currentScene.setRoot(root);
    primaryStage.setTitle((String) root.getUserData());
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  public void closeView()
  {
    primaryStage.close();
  }

  private Region loadViewMainWindow()
  {
    mainWindowController.reset();
    return mainWindowController.getRoot();
  }


  private Region loadViewDataObjectWindow()
  {
    dataObjectWindowController.reset();
    return dataObjectWindowController.getRoot();
  }


  public DataObjectWindowController getDataObjectWindowController()
  {
    return dataObjectWindowController;
  }

}
