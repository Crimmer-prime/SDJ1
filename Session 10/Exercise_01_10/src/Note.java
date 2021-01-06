public class Note
{
    private String message;
    private boolean highPriority;

    public Note (String message)
    {
        this.message=message;
    }
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public boolean isHighPriority() {
        return highPriority;
    }

    public void setHighPriority() {
        highPriority = true;
    }
    public void setLowPriority()
    {
        highPriority = false;
    }
    public Note copy()
    {
        Note newNote = new Note(message);
        return newNote;
    }

    @Override
    public String toString() {
        return "Note{" +
                "message='" + message + '\'' +
                ", highPriority=" + highPriority +
                '}';
    }
}
