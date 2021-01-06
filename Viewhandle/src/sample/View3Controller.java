package sample;

import javafx.scene.layout.Region;

public class View3Controller
{
  private Region root;
  private Model model;
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler, Model model, Region root)
  {
    System.out.println("LOAD COMPLETED");
    this.model = model;
    this.root = root;
    this.viewHandler = viewHandler;
  }

  public void reset()
  {
    //TODO: Reset all Java FX components
  }

  public Region getRoot()
  {
    return root;
  }

  public void gotoView1()
  {
    viewHandler.openView("view1");
  }
}
