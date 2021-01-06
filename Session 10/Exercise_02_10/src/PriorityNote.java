public class PriorityNote
{
    private String note;
    private boolean highPriority;

    public PriorityNote(String note)
    {
        this.note=note;
        highPriority=false;
    }
    public String getNote()
    {
        return note;
    }
    public void setNote(String note)
    {
        this.note = note;
    }
    public boolean isHighPriority()
    {
        return highPriority;
    }

    public void setHighPriority()
    {
        highPriority = true;
    }
    public void setLowPriority()
    {
        highPriority = false;
    }
    public PriorityNote copy()
    {
        PriorityNote copy = new PriorityNote(note);
        if (highPriority);
        copy.setHighPriority();
        if (!highPriority);
        copy.setLowPriority();
        return copy;
    }

    @Override
    public String toString() {
        return "PriorityNote{" +
                "note='" + note + '\'' +
                ", highPriority=" + highPriority +
                '}';
    }
}
