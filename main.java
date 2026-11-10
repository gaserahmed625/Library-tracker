public class Main {

 HEAD
   static java.util.List<String> books = new java.util.ArrayList<>();

static void searchBook(String keyword) {
    for (String b : books) {
        if (b.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Found: " + b);
        }
    }
}
static void removeBook(String title) {
    books.remove(title);
}

    public static void main(String[] args) {
System.out.println("*** Library Tracker ***");
=======
   
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
>>>>>>> origin/main
        System.out.println("Run with a command: add, list, search, remove");
    }
}