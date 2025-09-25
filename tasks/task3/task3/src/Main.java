import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. View Books");
            System.out.println("4. View Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bid, title, author));
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String uname = sc.nextLine();
                    library.addUser(new User(uid, uname));
                    break;
                case 3:
                    library.viewBooks();
                    break;
                case 4:
                    library.viewUsers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int ibid = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int iuid = sc.nextInt();
                    library.issueBook(ibid, iuid);
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();
                    library.returnBook(rid);
                    break;
                case 7:
                    System.out.println("Exiting system... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
