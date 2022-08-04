package SPR;

class Spr {
    public static void main(String[] args) throws Exception {
        Note note = new Note();
        note.addComment("My third comment");
        note.addComment("next comment");

        Persistence persistence = new Persistence();
        String filename = "e:\\notes123.txt";
        persistence.saveToFile(note, filename);

        System.out.println(note);
      //  Runtime.getRuntime().exec("gedit " + filename);
    }
}