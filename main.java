public class Main {

   static java.util.List<String> books = new java.util.ArrayList<>();

static void searchBook(String keyword) {
    for (String b : books) {
        if (b.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Found: " + b);
        }
    }
}

    public static void main(String[] args) {
        System.out.println("Library Tracker")
        System.out.println("Run with a command: add, list, search, remove");
    }
}