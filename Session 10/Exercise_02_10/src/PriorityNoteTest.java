public class PriorityNoteTest
{
    public static void main(String[] args)
    {
        PriorityNote note1 = new PriorityNote("Piss off");
        note1.setHighPriority();
        PriorityNote note2 = new PriorityNote("Fuck off");
        Notebook book1 = new Notebook();
        book1.addNote(note1);
        book1.addNote(note2);
        System.out.println(book1);
    }
}
