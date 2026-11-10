public class Main {

   
static java.util.List<String> books = new java.util.ArrayList<>();
// Adds a book title to the list of books
static void addBook(String title) {
    books.add(title);
}

static void listBooks() {
    for (String b : books) {
        System.out.println("- " + b);
    }

    public static void main(String[] args) {
        System.out.println("=== Library Tracker v1 ===");
        System.out.println("Run with a command: add, list, search, remove");
    }
}