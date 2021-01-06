import java.util.ArrayList;

public class Notebook
{
    private ArrayList<PriorityNote> notes;

    public Notebook()
    {
        notes = new ArrayList<PriorityNote>();
    }
    public void addNote(PriorityNote note)
    {
        notes.add(note.copy());
    }
    public void addNote(String note)
    {
        PriorityNote newNote = new PriorityNote(note);
        notes.add(newNote);
    }
    public void addHighPriorityNote(String note)
    {
        PriorityNote newNote = new PriorityNote(note);
        newNote.setHighPriority();
        notes.add(newNote);
    }
    public String getNote(int index)
    {
        return notes.get(index).getNote();
    }
    public boolean isHigPriotityNote (int index)
    {
        return notes.get(index).isHighPriority();
    }
    public int indexOfMostImportantNote()
    {
        for (int i = 0; i<notes.size();i++ )
        {
            if(notes.get(i).isHighPriority())
            {
                return i;
            }
        }
        return -1;
    }
    public String getMostImportantNote()
    {
        if (indexOfMostImportantNote() == -1)
            return "No such element";
        return notes.get(indexOfMostImportantNote()).getNote();
    }
    public void removeNote(int index)
    {
        notes.remove(index);
    }

    @Override
    public String toString()
    {
        return "Notebook{" +
                "notes=" + notes +
                '}';
    }
}
