public class Book extends Product {
    private String author;
    private int pages;

    @Override
    public boolean equals(Object obj) {
        boolean objIsEqual = false;
        Book bk = (Book) obj;

        if (super.getCode().equals(bk.getCode())) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (super.getDescription().equals(bk.getDescription())) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (super.getPrice() == bk.getPrice()) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.author.equals(bk.author)) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.pages == bk.pages) { objIsEqual = true; }
        else { objIsEqual = false; }

        return objIsEqual;
    }

    // Getters and Setters
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }
}
