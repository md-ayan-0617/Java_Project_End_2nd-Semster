import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void showDetails() {
        String status = isAvailable ? "Available" : "Issued";
        System.out.println("  Title   : " + title);
        System.out.println("  Author  : " + author);
        System.out.println("  Status  : " + status);
        System.out.println("  --------------------");
    }
}


class Library {
    Book[] books;
    int count;

    Library(int size) {
        books = new Book[size];
        count = 0;
    }

    void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
            System.out.println("Book added: " + b.title);
        } else {
            System.out.println("Library is full!");
        }
    }

    Book searchBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    void issueBook(String title) {
        Book b = searchBook(title);
        if (b == null) {
            System.out.println("Book not found: " + title);
            return;
        }
        if (b.isAvailable) {
            b.isAvailable = false;
            System.out.println("Book issued successfully: " + b.title);
        } else {
            System.out.println("Sorry, this book is already issued.");
        }
    }

    void returnBook(String title) {
        Book b = searchBook(title);
        if (b == null) {
            System.out.println("Book not found: " + title);
            return;
        }
        if (!b.isAvailable) {
            b.isAvailable = true;
            System.out.println("Book returned successfully: " + b.title);
        } else {
            System.out.println("This book was not issued.");
        }
    }

    void showAllBooks() {
        if (count == 0) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\n========= Book List =========");
        for (int i = 0; i < count; i++) {
            System.out.println("  [" + (i + 1) + "]");
            books[i].showDetails();
        }
    }
}


public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library(10);

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("    LIBRARY MANAGEMENT SYSTEM ");
            System.out.println("==============================");
            System.out.println("1. Add New Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String newAuthor = sc.nextLine();
                    lib.addBook(new Book(newTitle, newAuthor));
                    break;

                case 2:
                    lib.showAllBooks();
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    Book found = lib.searchBook(searchTitle);
                    if (found != null) {
                        System.out.println("\nBook Found:");
                        found.showDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    lib.issueBook(issueTitle);
                    break;

                case 5:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = sc.nextLine();
                    lib.returnBook(returnTitle);
                    break;

                case 6:
                    System.out.println("Thank you! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}