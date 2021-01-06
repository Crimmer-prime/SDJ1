public class NoteTest
{
    public static void main(String[] args)
    {
        Note note1 = new Note("Help");
        note1.getMessage();
        Note note2 = new Note("Send help");
        note2.setMessage("Send help");
        Notebook book1 = new Notebook(25);
        book1.addNote(note1);
        book1.addNote(note2);
        book1.addHighPriorityNote("Please help me");
        book1.getAllHighPriorityNotes();
        System.out.println(book1);
    }
}
