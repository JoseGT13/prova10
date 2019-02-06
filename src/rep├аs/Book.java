package repàs;

/**
 *
 * @author marcjoan
 */
public class Book {

    private String title;
    private String theme;
    private String autor;
    private int ISBN;

    public Book(String title, String theme, String autor, int ISBN) {
        this.title = title;
        this.theme = theme;
        this.autor = autor;
        this.ISBN = ISBN;
        System.out.println("---------------------");
        System.out.println("You created a book named: " + this.title);
        System.out.println("---------------------");
        System.out.println();
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;

        System.out.println("---------------------");
        System.out.println("You changed the name " + this.title + " to " + newTitle);
        System.out.println("---------------------");
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public String getTheme() {
        return theme;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void getInfo() {
        System.out.println("---------------------");
        System.out.println("'" + getTitle() + "' info:");
        System.out.println("    Theme: " + getTheme());
        System.out.println("    Author: " + getAutor());
        System.out.println("    ISBN: " + getISBN());
        System.out.println("---------------------");
        System.out.println();
    }

}
