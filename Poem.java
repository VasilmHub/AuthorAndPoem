package zad_07upr;

public class Poem {
    private String title;
    private String content;
    private Author author;

    public Poem(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public static boolean comperePoems(Poem p1, Poem p2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        appendToSb(p1, sb1);
        appendToSb(p2, sb2);
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false;

    }
    public boolean compare(Poem p){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        appendToSb(this, sb1);
        appendToSb(p, sb2);
        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false;

    }

    private static void appendToSb(Poem p1, StringBuilder sb1) {
        for (int i = 0; i < p1.content.length(); i++) {
            if (Character.isLetter(p1.content.charAt(i))) {

                sb1.append(Character.toLowerCase(p1.content.charAt(i)));
            }

        }
    }
}
