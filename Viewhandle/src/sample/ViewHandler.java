package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{

  private Scene currentScene;
  private Stage primaryStage;

  private View1Controller view1Controller;
  private View2Controller view2Controller;
  private View3Controller view3Controller;

  private Model model;

  public ViewHandler(Model model)
  {
    this.model = model;
    currentScene = new Scene(new Region());
  }

  public void start(Stage primaryStage)
  {
    this.primaryStage = primaryStage;
    openView("view1");
  }

  public void openView(String id)
  {
    Region root = null;
    switch (id)
    {
      case "view1":
        root = loadView1();
        break;
      case "view2":
        root = loadView2("View2.fxml");
        break;
      case "view3":
        root = loadView3("View3.fxml");
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

  private Region loadView1()
  {
    if(view1Controller == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("View1.fxml"));
        Region root = loader.load();
        view1Controller = loader.getController();
        view1Controller.init(this, model, root);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      view1Controller.reset();
    }
    return view1Controller.getRoot();

  }
  private Region loadView2(String fxmlFile)
  {
    if(view2Controller == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("View2.fxml"));
        Region root = loader.load();
        view2Controller = loader.getController();
        view2Controller.init(this, model, root);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      view2Controller.reset();
    }
    return view2Controller.getRoot();
  }
  private Region loadView3(String fxmlFile)
  {
    if(view3Controller == null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("View3.fxml"));
        Region root = loader.load();
        view3Controller = loader.getController();
        view3Controller.init(this, model, root);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    else
    {
      view3Controller.reset();
    }
    return view3Controller.getRoot();
  }
}
