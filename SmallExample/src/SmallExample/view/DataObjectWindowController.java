package SmallExample.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import SmallExample.model.DataObject;
import SmallExample.model.ModelInterface;
public class DataObjectWindowController
{
  private Region root;
  private ModelInterface model;
  private ViewHandler viewHandler;
  private DataObject currentlySelectedDataObject;

  @FXML private TextField attribute1Input;
  @FXML private TextField attribute2Input;
  @FXML private TextField attribute3Input;


  public void init(ViewHandler viewHandler, ModelInterface model, Region root)
  {
    this.model = model;
    this.root = root;
    this.viewHandler = viewHandler;
  }

  public void submit()
  {
    String attribute1 = attribute1Input.getText();
    int attribute2 = Integer.parseInt(attribute2Input.getText());
    boolean attribute3 = Boolean.parseBoolean(attribute3Input.getText());

    //if we are creating a new DataObject and not modifying an existing one
    if(currentlySelectedDataObject == null)
    {
      DataObject dataObject = new DataObject(attribute1, attribute2, attribute3);
      model.addDataObject(dataObject);
    }
    //otherwise, we must be editing an existing DataObject, and thus only need to update the attributes
    //We don't know which (if any) attribute was edited in the textfield, so we just update all of them
    else
    {
      currentlySelectedDataObject.setAttribute1(attribute1);
      currentlySelectedDataObject.setAttribute2(attribute2);
      currentlySelectedDataObject.setAttribute3(attribute3);
    }
    viewHandler.openView("MainWindow");
    reset();


  }

  public void cancel()
  {
    viewHandler.openView("MainWindow");
    reset();
  }

  public void reset()
  {
    attribute1Input.setText("");
    attribute2Input.setText("");
    attribute3Input.setText("");
    currentlySelectedDataObject = null;
  }

  public Region getRoot()
  {
    return root;
  }

  public void setCurrentlySelectedDataObject(DataObject currentlySelectedDataObject)
  {
    this.currentlySelectedDataObject = currentlySelectedDataObject;
  }

  public void populateFields()
  {
    attribute1Input.setText(currentlySelectedDataObject.getAttribute1());
    attribute2Input.setText(Integer.toString(currentlySelectedDataObject.getAttribute2()));
    attribute3Input.setText(Boolean.toString(currentlySelectedDataObject.getAttribute3()));
  }
}
