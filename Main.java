package zad_07upr;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Koceto", "Varna", "08881130113");
        Author author2 = new Author("Koceto00", "Varna", "08881130113");
        Poem p1 = new Poem("zaglavieto", "Tova e !", author);
        Poem p2 = new Poem("zaglav", "Tova! E !", author);
        System.out.println(Poem.comperePoems(p1, p2));
        System.out.println(p1.compare(p2));
        author.setNumber("(567) 123-8888");
        System.out.println(author.getNumber());

    }
}
