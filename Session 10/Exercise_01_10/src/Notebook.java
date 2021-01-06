import java.util.Arrays;

public class Notebook
{
    private int numberOfNotes;
    private Note[] notes;

    public Notebook (int maxNumberOfNotes)
    {
        numberOfNotes = 0;
        notes = new Note[maxNumberOfNotes];
    }

    public int getNumberOfNotes()
    {
        return numberOfNotes;
    }
    public Note getNote(int index)
    {
        return notes[index];
    }
    public void addNote (Note note)
    {
        notes[numberOfNotes] = note.copy();
        numberOfNotes++;
    }
    public void addNote (String message)
    {
        notes [numberOfNotes] = new Note(message);
        numberOfNotes++;
    }
    public void addHighPriorityNote (String message)
    {
        notes [numberOfNotes] = new Note(message);
        numberOfNotes++;
    }
    public void removeNote (int index)
    {
        if (numberOfNotes - 1 - index >= 0) System.arraycopy(notes, index + 1, notes, index, numberOfNotes - 1 - index);
        notes[numberOfNotes - 1] = null;
        numberOfNotes--;
    }
    public Note[] getAllNotes()
    {
            return getAllNotes();
    }
    public int getAllHighPriorityNotes()
    {
        return numberOfNotes;
    }

    public String toString() {
        return "Notebook{" +
                "numberOfNotes=" + numberOfNotes +
                ", notes=" + Arrays.toString(notes) +
                '}';
    }
}
