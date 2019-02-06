package repàs;

import java.util.Scanner;

/**
 *
 * @author marcjoan
 */
public class Library {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Book book = new Book("Maus", "Nazi", "Hitler", 666);
        book.setTitle("Mein kampt");
        book.getInfo();
    }

}
