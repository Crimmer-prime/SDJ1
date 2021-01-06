package sample;

import javafx.scene.layout.Region;

public class View2Controller
{
  private Region root;
  private Model model;
  private ViewHandler viewHandler;

  public void reset()
  {
    //TODO: Reset all Java FX components
  }

  public Region getRoot()
  {
    return root;
  }

  public void init(ViewHandler viewHandler, Model model, Region root)
  {
    System.out.println("LOAD COMPLETED");
    this.model = model;
    this.root = root;
    this.viewHandler = viewHandler;
  }

  public void gotoView3()
  {
    viewHandler.openView("view3");
  }
}
