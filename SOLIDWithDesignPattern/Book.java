public class Book implements LibraryResource {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Book";
    }
}
