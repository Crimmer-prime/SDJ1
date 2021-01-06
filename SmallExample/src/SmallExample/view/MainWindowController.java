package SmallExample.view;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import SmallExample.model.DataObject;
import SmallExample.model.ModelInterface;

public class MainWindowController
{
  private Region root;
  private ModelInterface model;
  private ViewHandler viewHandler;

  @FXML private TableView dataObjectTableView;

  public void reset()
  {
    updateTable();
  }

  private void updateTable() {
    //Remove all current elements, then re-read the entire list and add everything. Not the best solution...
    dataObjectTableView.getItems().clear();
    dataObjectTableView.getItems().addAll(model.getAllDataObjects());
  }

  public void createNew()
  {
    viewHandler.openView("DataObjectWindow");
  }

  public void editSelected()
  {
    DataObject selectedDataObject = (DataObject) dataObjectTableView.getSelectionModel().getSelectedItem();
    if(selectedDataObject == null)
    {
      System.out.println("No item selected");
      return; //Or generate a warning
    }

    viewHandler.openView("DataObjectWindow");
    viewHandler.getDataObjectWindowController().setCurrentlySelectedDataObject(selectedDataObject);
    viewHandler.getDataObjectWindowController().populateFields();
  }

  public void populateTable()
  {
    TableColumn<DataObject, String> attribute1Column = new TableColumn<>("Attribute1");
    TableColumn<DataObject, Integer> attribute2Column = new TableColumn<>("Attribute2");
    TableColumn<DataObject, Boolean> attribute3Column = new TableColumn<>("Attribute3");

    attribute1Column.setCellValueFactory(new PropertyValueFactory<>("attribute1"));
    attribute2Column.setCellValueFactory(new PropertyValueFactory<>("attribute2"));
    attribute3Column.setCellValueFactory(new PropertyValueFactory<>("attribute3"));

    dataObjectTableView.getColumns().add(attribute1Column);
    dataObjectTableView.getColumns().add(attribute2Column);
    dataObjectTableView.getColumns().add(attribute3Column);

    dataObjectTableView.getItems().addAll(model.getAllDataObjects());
  }

  public Region getRoot()
  {
    return root;
  }

  public void init(ViewHandler viewHandler, ModelInterface model, Region root)
  {
    System.out.println("LOAD COMPLETED");
    this.model = model;
    this.root = root;
    this.viewHandler = viewHandler;
    populateTable();
  }

  public void save()
  {
    model.save();
  }


}
