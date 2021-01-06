package SmallExample.model;

import SmallExample.util.FileHandler;

import java.util.ArrayList;

public class Model implements ModelInterface{

    private ListOfDataObjects listOfDataObjects;

    public Model()
    {
        //Creating dummy data
        listOfDataObjects = new ListOfDataObjects();
        listOfDataObjects.addDataObject(new DataObject("att1 - 1", 1, true));
        listOfDataObjects.addDataObject(new DataObject("att1 - 2", 2, true));
        listOfDataObjects.addDataObject(new DataObject("att1 - 3", 3, false));
        listOfDataObjects.addDataObject(new DataObject("att1 - 4", 4, true));
    }

    @Override
    public ArrayList<DataObject> getAllDataObjects() {
        return listOfDataObjects.getAllDataObjects();
    }

    @Override
    public DataObject getDataObjectByName(String attribute1) {
        return listOfDataObjects.getDataObjectByAttribute1(attribute1);
    }

    @Override
    public void addDataObject(DataObject dataObject) {
        listOfDataObjects.addDataObject(dataObject);
    }

    @Override
    public void save()
    {
        //I choose to save the Object "listOfDataObjects" but I could save anything that implements Serializable
        FileHandler.save(listOfDataObjects);
    }


}
