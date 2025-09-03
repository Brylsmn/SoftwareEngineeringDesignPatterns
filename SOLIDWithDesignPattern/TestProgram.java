public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();
        Book book = new Book("Clean Code");
        Journal journal = new Journal("IEEE Transactions on Pattern Analysis and Machine Intelligence");

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}
