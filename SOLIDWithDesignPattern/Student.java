public class Student {
    public void borrowResource(LibraryResource resource) {
        System.out.println("Borrowed " + resource.getResourceType() + ": " + resource.getTitle());
    }
}
