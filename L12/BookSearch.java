class Book implements Comparable<Book> {
    private String name;
    private double cost;

    public Book(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Book: " + name + ", Cost: " + cost;
    }
}

class GeneralizedSearch {
    public static boolean search(Object[] arr, Object item) {
        for (Object obj : arr) {
            if (obj.equals(item)) {
                return true;
            }
        }
        return false;
    }
}

public class BookSearch {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Programming", 50.0),
            new Book("Data Structures", 40.0),
        };

        Book searchItem = new Book("Java Programming", 50.0);
        boolean found = GeneralizedSearch.search(books, searchItem);
        System.out.println("Book found: " + found);
    }
}