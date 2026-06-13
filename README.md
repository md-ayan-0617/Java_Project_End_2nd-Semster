# Library Management System
### Java OOP Console Application

A menu-driven Library Management System built in Java using core Object-Oriented Programming concepts. The program runs in a loop and lets the user add books, search them, issue and return them — just like a real library counter.

---

## Program Structure

```
LibraryManagement.java
│
├── class Book
│   ├── Fields
│   │   ├── String title
│   │   ├── String author
│   │   └── boolean isAvailable
│   │
│   ├── Book(String title, String author)   → constructor
│   └── void showDetails()                 → print book info
│
├── class Library
│   ├── Fields
│   │   ├── Book[] books                   → array to store books
│   │   └── int count                      → tracks total books added
│   │
│   ├── Library(int size)                  → constructor
│   ├── void addBook(Book b)               → add a new book
│   ├── Book searchBook(String title)      → search by title, returns Book or null
│   ├── void issueBook(String title)       → issue a book
│   ├── void returnBook(String title)      → return a book
│   └── void showAllBooks()                → display all books
│
└── class LibraryManagement
    └── main(String[] args)                → Scanner input + menu loop
```

---

## OOP Pillars Used

| Pillar | Used | Where |
|---|---|---|
| Encapsulation | ✅ Yes | Data and methods bundled inside `Book` and `Library` class |
| Abstraction | ✅ Yes | User just calls `issueBook()`, inner logic is hidden |
| Inheritance | ❌ No | Not needed for this scope |
| Polymorphism | ✅ Partial | `showDetails()` works differently on each `Book` object |

---

## Features

- Start with empty library — no hardcoded books
- Add books manually at runtime
- Search book by title (case-insensitive)
- Issue a book — marks it as unavailable
- Return a book — marks it back as available
- View all books with their current status
- Handles all edge cases (book not found, already issued, not issued)
- Menu runs in a loop until user exits

---

## Menu Options

```
==============================
    LIBRARY MANAGEMENT SYSTEM
==============================
1. Add New Book
2. Show All Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit
```

---

## How to Run

**Step 1 — Compile**
```bash
javac LibraryManagement.java
```

**Step 2 — Run**
```bash
java LibraryManagement
```

> Requires Java 8 or above. No external libraries needed.

---

## Sample Usage

```
Enter your choice: 1
Enter book title: The Alchemist
Enter author name: Paulo Coelho
Book added: The Alchemist

Enter your choice: 4
Enter book title to issue: The Alchemist
Book issued successfully: The Alchemist

Enter your choice: 4
Enter book title to issue: The Alchemist
Sorry, this book is already issued.

Enter your choice: 5
Enter book title to return: The Alchemist
Book returned successfully: The Alchemist

Enter your choice: 6
Thank you! Goodbye.
```

---

## Requirements

- Java 8 or above
- Terminal / Command Prompt
- No external dependencies
## Output
<img width="1919" height="866" alt="image" src="https://github.com/user-attachments/assets/967c07f3-daca-46e8-9183-b8ec67636066" />
<img width="1919" height="866" alt="image" src="https://github.com/user-attachments/assets/d672da23-30b3-48d0-a37a-d8695e8f6609" />
<img width="1919" height="1036" alt="image" src="https://github.com/user-attachments/assets/1052089c-7e08-4b6b-96bf-cd486e2618bd" />
<img width="1842" height="933" alt="image" src="https://github.com/user-attachments/assets/8b7220c5-88cc-4416-9f20-08f38b25cb97" />





































