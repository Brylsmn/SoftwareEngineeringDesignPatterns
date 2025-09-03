public class Journal implements LibraryResource {
    private final String title;
    
    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceType() {
        return "Journal";
    }
}
