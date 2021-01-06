package SmallExample.model;

import java.io.Serializable;

public class DataObject implements Serializable {

    private String attribute1;
    private int attribute2;
    private boolean attribute3;

    public DataObject(String attribute1, int attribute2, boolean attribute3) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public boolean getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(boolean attribute3) {
        this.attribute3 = attribute3;
    }
}
