/**
 * Author: John Kneisler
 * Date: 09/18/19
 *
 * This class will test whether the newly overridden equals method works for product, book, and software classes.
 *
 * Assumptions: I am assuming that class1.equals(class2) will produce the same outcome as class2.equals(class1)
 */
public class TestApp {
    public static void main(String[] args) {
        System.out.println("This test routine determine if the overridden equals method is working properly.");
        System.out.println();

        // Testing Product's equals method
        System.out.println("Testing whether two products are equal.");
        Product prod1 = new Product();
        Product prod2 = new Product();
        prod1.setCode("123");
        prod2.setCode("123");
        prod1.setDescription("This is a product");
        prod2.setDescription("This is a product");
        prod1.setPrice(12.34);
        prod2.setPrice(12.34);
        System.out.println("\tThe results of this test should show whether the products prod1 and prod2 are equal.");
        if (prod1.equals(prod2)) {
            System.out.println("\t\tThe products prod1 and prod2 are equal.");
        }
        else {
            System.out.println("\t\tThe products prod1 and prod2 are not equal.");
        }
        System.out.println("\tTesting whether two products are not equal.");
        prod2.setPrice(12.35);
        if (prod1.equals(prod2)) {
            System.out.println("\t\tThe products prod1 and prod2 are equal.");
        }
        else {
            System.out.println("\t\tThe products prod1 and prod2 are not equal.");
        }

        // Testing Book's equals method
        System.out.println("\nTesting whether two books are equal.");
        Book bk1 = new Book();
        Book bk2 = new Book();
        bk1.setAuthor("Shakespeare");
        bk2.setAuthor("Shakespeare");
        bk1.setPages(1234);
        bk2.setPages(1234);
        System.out.println("\tThe results of this test should show whether the books bk1 and bk2 are equal.");
        if (bk1.equals(bk2)) {
            System.out.println("\t\tThe books bk1 and bk2 are equal.");
        }
        else {
            System.out.println("\t\tThe books bk1 and bk2 are not equal.");
        }
        System.out.println("\tTesting whether two books are not equal.");
        bk2.setPages(1235);
        if (bk1.equals(bk2)) {
            System.out.println("\t\tThe books bk1 and bk2 are equal.");
        }
        else {
            System.out.println("\t\tThe books bk1 and bk2 are not equal.");
        }

        // Testing Software's equals method
        System.out.println("\nTesting whether two software products are equal.");
        Software sftw1 = new Software();
        Software sftw2 = new Software();
        sftw1.setProgrammer("Alan Turing");
        sftw2.setProgrammer("Alan Turing");
        sftw1.setPlatform("UNIX");
        sftw2.setPlatform("UNIX");
        sftw1.setOs("Linux");
        sftw2.setOs("Linux");
        System.out.println("\tThe results of this test should show whether the software products swft1 and swft2 are equal.");
        if (sftw1.equals(sftw2)) {
            System.out.println("\t\tThe software products sftw1 and sftw2 are equal.");
        }
        else {
            System.out.println("\t\tThe software products sftw1 and sftw2 are not equal.");
        }
        System.out.println("\tTesting whether two software products are not equal.");
        sftw2.setOs("Windows");
        if (sftw1.equals(sftw2)) {
            System.out.println("\t\tThe software products sftw1 and sftw2 are equal.");
        }
        else {
            System.out.println("\t\tThe software products sftw1 and sftw2 are not equal.");
        }
        System.out.println("\nThe end of testing.");
    }
}
