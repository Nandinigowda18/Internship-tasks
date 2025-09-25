import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) System.out.println(b);
        }
    }

    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered.");
        } else {
            for (User u : users) System.out.println(u);
        }
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book already issued.");
        } else {
            book.setIssued(true);
            System.out.println("Book issued to " + user.getName());
        }
    }

    public void returnBook(int bookId) {
        Book book = findBook(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!book.isIssued()) {
            System.out.println("Book was not issued.");
        } else {
            book.setIssued(false);
            System.out.println("Book returned successfully.");
        }
    }

    private Book findBook(int id) {
        for (Book b : books) if (b.getId() == id) return b;
        return null;
    }

    private User findUser(int id) {
        for (User u : users) if (u.getId() == id) return u;
        return null;
    }
}
