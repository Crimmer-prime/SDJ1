package SmallExample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListOfDataObjects implements Serializable {

    private ArrayList<DataObject> list;

    public ListOfDataObjects() {
        list = new ArrayList<>();
    }

    public void addDataObject(DataObject dataObject)
    {
        list.add(dataObject);
    }

    public void removeDataObject(DataObject dataObject)
    {
        list.remove(dataObject);
    }

    public DataObject getDataObjectByAttribute1(String attribute1)
    {
        for (DataObject dataObject : list)
        {
            if(dataObject.getAttribute1().equals(attribute1))
                return dataObject;
        }
        throw new NoSuchElementException("No element matching " + attribute1 + " was found");
    }

    public ArrayList<DataObject> getAllDataObjects()
    {
        return list;
    }
}
